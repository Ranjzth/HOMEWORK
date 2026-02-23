package calculator1;

import java.util.Scanner;

public class GenericCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Generic Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Choose Type: 1.Integer  2.Double");
                    int type1 = scanner.nextInt();

                    if (type1 == 1) {
                        Calculator<Integer> intCalc = new Calculator<>();
                        System.out.print("Enter first integer: ");
                        int a = scanner.nextInt();
                        System.out.print("Enter second integer: ");
                        int b = scanner.nextInt();
                        System.out.println("Result: " + intCalc.add(a, b));
                    } else if (type1 == 2) {
                        Calculator<Double> doubleCalc = new Calculator<>();
                        System.out.print("Enter first double: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second double: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + doubleCalc.add(a, b));
                    }
                    break;

                case 2:
                    System.out.println("Choose Type: 1.Integer  2.Double");
                    int type2 = scanner.nextInt();

                    if (type2 == 1) {
                        Calculator<Integer> intCalc = new Calculator<>();
                        System.out.print("Enter first integer: ");
                        int a = scanner.nextInt();
                        System.out.print("Enter second integer: ");
                        int b = scanner.nextInt();
                        System.out.println("Result: " + intCalc.subtract(a, b));
                    } else if (type2 == 2) {
                        Calculator<Double> doubleCalc = new Calculator<>();
                        System.out.print("Enter first double: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second double: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + doubleCalc.subtract(a, b));
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}