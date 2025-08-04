import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Basic Calculator");
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextLine();

            if (choice.equals("5")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case "1":
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "2":
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case "3":
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case "4":
                    try {
                        System.out.println("Result: " + divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }

            System.out.println(); // Print a blank line for better readability

        } while (true);

        scanner.close();
    }
}
