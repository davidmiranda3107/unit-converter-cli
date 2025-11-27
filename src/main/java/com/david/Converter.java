package com.david;

import java.util.Scanner;

public class Converter {

    public void temperatureMenu(Scanner scanner) {
        System.out.println("\n-- Temperature Conversion --");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        double result = 0;

        switch (option) {
            case 1:
                result = celsiusToFahrenheit(value);
                System.out.println(value + "°C = " + result + "°F");
                break;
            case 2:
                result = fahrenheitToCelsius(value);
                System.out.println(value + "°F = " + result + "°C");
                break;
            case 3:
                result = celsiusToKelvin(value);
                System.out.println(value + "°C = " + result + "K");
                break;
            case 4:
                result = kelvinToCelsius(value);
                System.out.println(value + "K = " + result + "°C");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void distanceMenu(Scanner scanner) {
        System.out.println("\n-- Distance Conversion --");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        double result = 0;

        switch (option) {
            case 1:
                result = kilometersToMiles(value);
                System.out.println(value + " km = " + result + " miles");
                break;
            case 2:
                result = milesToKilometers(value);
                System.out.println(value + " miles = " + result + " km");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void weightMenu(Scanner scanner) {
        System.out.println("\n-- Weight Conversion --");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        double result = 0;

        switch (option) {
            case 1:
                result = kilogramsToPounds(value);
                System.out.println(value + " kg = " + result + " lbs");
                break;
            case 2:
                result = poundsToKilograms(value);
                System.out.println(value + " lbs = " + result + " kg");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // ---------------- Conversion Methods ----------------
    public double celsiusToFahrenheit(double c) { return c * 9 / 5 + 32; }
    public double fahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public double celsiusToKelvin(double c) { return c + 273.15; }
    public double kelvinToCelsius(double k) { return k - 273.15; }

    public double kilometersToMiles(double km) { return km * 0.621371; }
    public double milesToKilometers(double mi) { return mi / 0.621371; }

    public double kilogramsToPounds(double kg) { return kg * 2.20462; }
    public double poundsToKilograms(double lbs) { return lbs / 2.20462; }
}
