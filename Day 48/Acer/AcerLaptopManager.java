package acer;

import java.util.ArrayList;
import java.util.Scanner;

public class AcerLaptopManager 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Acer> laptops = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1 for Entry  2 for Search  3 for Exit");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {

                System.out.println("Enter the model of laptop:");
                String model = sc.nextLine();

                System.out.println("Color of the laptop:");
                String colour = sc.nextLine();

                System.out.println("Is it RGB keyboard (true/false):");
                boolean rgb = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Processor:");
                String processor = sc.nextLine();

                System.out.println("Price:");
                double price = sc.nextDouble();
                sc.nextLine();

                laptops.add(new Acer(model, colour, rgb, processor, price));
            }

            else if (choice == 2) {

                System.out.println("Enter the laptop name:");
                String search = sc.nextLine();

                boolean found = false;

                for (Acer lap : laptops) {
                    if (lap.model.equalsIgnoreCase(search)) {
                        lap.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Laptop not found.");
                }
            }

        } while (choice != 3);

        System.out.println("Program ended.");
    }
}