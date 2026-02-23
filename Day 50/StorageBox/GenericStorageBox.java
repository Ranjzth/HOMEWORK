package box;

import java.util.Scanner;

public class GenericStorageBox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BOX<Object> box = new BOX<>();   // Using generic class
        int choice;

        do {
            System.out.println("\n===== Generic Storage Box =====");
            System.out.println("1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter an Integer: ");
                    int number = scanner.nextInt();
                    box.store(number);
                    System.out.println("Integer stored successfully.");
                    break;

                case 2:
                    scanner.nextLine(); // fix input buffer issue
                    System.out.print("Enter a String: ");
                    String text = scanner.nextLine();
                    box.store(text);
                    System.out.println("String stored successfully.");
                    break;

                case 3:
                    Object value = box.getValue();
                    if (value != null) {
                        System.out.println("Stored Value: " + value);
                        System.out.println("Type: " + value.getClass().getSimpleName());
                    } else {
                        System.out.println("Box is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}