package ordertrackingsystem;

import java.util.Scanner;

enum OrderStatus
{
    PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class OrderTrackingSystem 
{

    public static boolean isCompleted(OrderStatus status) 
    {
        return status == OrderStatus.DELIVERED;
    }

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        OrderStatus currentStatus = OrderStatus.PLACED; 
        int choice;

        do 
        {
            System.out.println("\n===== Order Status Tracking =====");
            System.out.println("1. Show Order Status");
            System.out.println("2. Check if Order is Completed");
            System.out.println("3. Update Order Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) 
                    {

                case 1:
                    System.out.println("Current Order Status: " + currentStatus);
                    break;

                case 2:
                    if (isCompleted(currentStatus))
                    {
                        System.out.println("The order is completed.");
                    } 
                    else 
                    {
                        System.out.println("The order is not completed.");
                    }
                    break;

                case 3:
                    System.out.println("Enter new status (PLACED, SHIPPED, DELIVERED, CANCELLED): ");
                    String input = scanner.nextLine().toUpperCase();
                    try 
                    {
                        currentStatus = OrderStatus.valueOf(input);
                        System.out.println("Order status updated successfully.");
                    } 
                    catch (IllegalArgumentException e) 
                    {
                        System.out.println("Invalid status entered.");
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
