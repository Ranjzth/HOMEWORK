package weekdayworkingsystem;

import java.util.Scanner;

enum Day 
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeekdayWorkingSystem 
{

    public static boolean isWorkingDay(Day day) 
    {
        return day != Day.SATURDAY && day != Day.SUNDAY;
    }

    public static boolean isWeekend(Day day) 
    {
        return day == Day.SATURDAY || day == Day.SUNDAY;
    }

    public static void displayAllDays() 
    {
        for (Day day : Day.values())
        {
            System.out.println(day);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Weekday Working System =====");
            System.out.println("1. Check if day is Working Day");
            System.out.println("2. Check if day is Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter day: ");
                    String inputDay1 = scanner.nextLine().toUpperCase();
                    try {
                        Day day1 = Day.valueOf(inputDay1);
                        if (isWorkingDay(day1)) 
                        {
                            System.out.println(day1 + " is a Working Day.");
                        }
                        else 
                        {
                            System.out.println(day1 + " is not a Working Day.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid day entered.");
                    }
                    break;

                case 2:
                    System.out.print("Enter day: ");
                    String inputDay2 = scanner.nextLine().toUpperCase();
                    try {
                        Day day2 = Day.valueOf(inputDay2);
                        if (isWeekend(day2)) 
                        {
                            System.out.println(day2 + " is a Weekend.");
                        } 
                        else 
                        {
                            System.out.println(day2 + " is not a Weekend.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid day entered.");
                    }
                    break;

                case 3:
                    System.out.println("All Days of the Week:");
                    displayAllDays();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
