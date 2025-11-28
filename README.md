# Unit Converter CLI (Java Project)

A simple Command-Line Unit Converter built in Java, featuring temperature, distance, weight, and currency conversion.

## Features

- Convert **temperature**: Celsius ↔ Fahrenheit ↔ Kelvin
- Convert **distance**: Kilometers ↔ Miles
- Convert **weight**: Kilograms ↔ Pounds
- Convert **currency**: Real-time conversion using a public API ([Currency-API](https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies))
- Interactive **Command-Line Interface (CLI)** with menus
- Input validation for safe and error-free usage

## Technical Highlights

- Fully object-oriented architecture:
    - `Main.java` — program entry and menu
    - `Converter.java` — conversion logic for temperature, distance, and weight
    - `CurrencyAPI.java` — fetches live exchange rates from public API
- JSON parsing using **Gson** for currency API response
- Clean modular design, easy to extend with more units or currencies
- Robust input handling to prevent invalid entries

## Project Structure

```md
src/main/java/com/david/unitconverter/
├── Main.java
├── Converter.java
└── CurrencyAPI.java
```

## How to Run

Make sure you have:

- Java 21 (or your installed version)
- Maven (optional if you want to manage dependencies)
- IntelliJ IDEA or any Java IDE

Run the program:

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.david.Main"
```

## Dependencies
- Gson is used to parse JSON from the currency API.
```mvn
<dependency>
<groupId>com.google.code.gson</groupId>
<artifactId>gson</artifactId>
<version>2.10.1</version>
</dependency>
```
## Next Improvements (Optional / Roadmap)

- Add more currencies or units (volume, speed, etc.)
- Save favorite conversions locally (JSON or CSV)
- Add history of conversions for quick access
- Implement GUI using JavaFX for visual interface
- Write JUnit tests for unit conversion accuracy

## Purpose
This project is part of a personal portfolio to strengthen programming fundamentals in Java and develop real, practical applications.
