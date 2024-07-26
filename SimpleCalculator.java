import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        System.out.println("Simple Calculator");
        
        System.out.print("Enter the first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        num1 = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please enter one of +, -, *, /.");
        }
        
        scanner.close();
    }
}
