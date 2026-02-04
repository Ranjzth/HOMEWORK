package transportmanagementsystem;

public class ManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Transport transport = null;
        int choice;

        do
        {
            System.out.println("\n*****TRANSPORT MANAGEMENT SYSTEM*****");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();
            
            switch (choice)
            {

                case 1:
                    System.out.print("Enter Passenger ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.println("\n Select Route : ");
                    System.out.println("1. Chennai -> Bangalore");
                    System.out.println("2. Chennai -> Coimbatore");
                    System.out.println("3. Chennai -> Madurai");
                    System.out.println("4. Chennai -> Trichy");
                    System.out.println("5. Chennai -> Salem");
                    System.out.print("Enter route choice: ");
                    int route = sc.nextInt();

                    String fromCity = "Chennai";
                    String toCity = "";
                    double distance = 0;
                    
                    switch (route) {
                        case 1: toCity = "Bangalore"; distance = 350; break;
                        case 2: toCity = "Coimbatore"; distance = 500; break;
                        case 3: toCity = "Madurai"; distance = 460; break;
                        case 4: toCity = "Trichy"; distance = 330; break;
                        case 5: toCity = "Salem"; distance = 340; break;
                        default:
                            continue;
                    }

                    if (choice == 1) 
                    {
                        transport = new CityBus(id, name, fromCity, toCity, distance);
                    }
                    else
                    {
                        transport = new LuxuryBus(id, name, fromCity, toCity, distance);
                    }

                    System.out.println("Ticket Booked Successfully");
                    break;

                case 2:
                    if (transport != null)
                    {
                        transport.CalculateFare();
                        System.out.println("Fare Calculated Successfully");
                    } 
                    else
                    {
                        System.out.println("Please book a ticket first!");
                    }
                    break;

                case 3:
                    if (transport != null) 
                    {
                        transport.displayTic();
                    } 
                    else 
                    {
                        System.out.println("No ticket to display!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Transport Management System!");
                    break;

                default:
            }

        } while (choice != 4);


    }
}


