import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the Interactive Calculator!");
        while (running) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                running = false;
                System.out.println("Goodbye!");
                continue;
            }
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = 0;
            boolean valid = true;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    valid = false;
            }
            if (valid && choice >= 1 && choice <= 4) {
                System.out.println("Result: " + result);
            }
        }
        scanner.close();
    }
}
