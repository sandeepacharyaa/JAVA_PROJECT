import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();
        
        System.out.println("Enter the unit of measurement (C for Celsius, F for Fahrenheit):");
        char unit = scanner.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheit);
        } else if (unit == 'F' || unit == 'f') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsius);
        } else {
            System.out.println("Invalid unit of measurement entered.");
        }
        
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

