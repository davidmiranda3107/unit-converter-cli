package com.david;

import com.google.gson.Gson;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

public class CurrencyAPI {

    //private final String BASE_URL = "https://api.exchangerate.host/latest";
    private final String BASE_URL = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies";
    private final Gson gson = new Gson();

    public void currencyMenu(Scanner scanner) {
        System.out.println("\n-- Currency Conversion --");
        System.out.print("Enter base currency (e.g., USD): ");
        String base = scanner.nextLine().toUpperCase();
        System.out.print("Enter target currency (e.g., EUR): ");
        String target = scanner.nextLine().toUpperCase();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer

        double result = convertCurrency(base, target, amount);
        if (result != -1) {
            System.out.println(amount + " " + base + " = " + result + " " + target);
        } else {
            System.out.println("Currency conversion failed.");
        }
    }

    private double convertCurrency(String base, String target, double amount) {
        try {
            String urlStr = BASE_URL + "/" + base.toLowerCase() + ".json";
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("HTTP Error: " + responseCode);
                return -1;
            }

            Scanner sc = new Scanner(url.openStream());
            StringBuilder inline = new StringBuilder();
            while (sc.hasNext()) {
                inline.append(sc.nextLine());
            }
            sc.close();

            Map<String, Object> data = gson.fromJson(inline.toString(), Map.class);
            Map<String, Double> rates = (Map<String, Double>) data.get(base.toLowerCase());
            return amount * rates.get(target.toLowerCase());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}
