import java.util.Scanner;

public class BankingSystem {

    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid amount: ");
            scanner.next();
        }
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited %.2f. Current balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid amount: ");
            scanner.next();
        }
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Successfully withdrew %.2f. Current balance: %.2f%n", amount, balance);
            } else {
                System.out.println("Insufficient funds. Current balance: " + balance);
            }
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    private static void checkBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }
}

