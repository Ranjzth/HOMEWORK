package shoppingcartapplication;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner bk = new Scanner(System.in);
        ShoppingCart sc = new ShoppingCart();
        
        int Choice;
        
        do
        {
            System.out.println("\n-----Shopping Cart Menu-----");
            System.out.println("1. Add Product To Cart");
            System.out.println("2. Viwe Cart Items");
            System.out.println("3. Exit");
            System.out.print("Enter The Choice : ");
            Choice = bk.nextInt();
            
            switch(Choice)
            {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int Id = bk.nextInt();
                    bk.nextLine();

                    System.out.print("Enter Product Name: ");
                    String Name = bk.nextLine();

                    System.out.print("Enter Price: ");
                    double Price = bk.nextDouble();

                    sc.Insert(Id, Name, Price);
                    break;

                case 2:
                    sc.display();
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    
            }
        } while (Choice != 3);

        }
}