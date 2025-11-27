package com.david;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        CurrencyAPI currencyAPI = new CurrencyAPI();

        while (true) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Temperature");
            System.out.println("2. Distance");
            System.out.println("3. Weight");
            System.out.println("4. Currency");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    converter.temperatureMenu(scanner);
                    break;
                case 2:
                    converter.distanceMenu(scanner);
                    break;
                case 3:
                    converter.weightMenu(scanner);
                    break;
                case 4:
                    currencyAPI.currencyMenu(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}