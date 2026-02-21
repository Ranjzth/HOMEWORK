package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner bk = new Scanner(System.in);
        StudentManagement Manger = new StudentManagement();
        
        int choice;
        
        do
        {
            System.out.println("*********Student   Management  System*********");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Student");
            System.out.println("5. Display Total Student");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");
            
            choice = bk.nextInt();
            
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student ID : ");
                    int id = bk.nextInt();
                    bk.nextLine();
                    
                    System.out.print("Enter Student Name : ");
                    String Name = bk.nextLine();
                    
                    Student s = new Student(id, Name);
                    Manger.AddStu(s.getId(), s.getName());
                    break;
                    
                    
                    
                case 2:
                    System.out.print("Enter Student Id For Remove : ");
                    Manger.Remove(bk.nextInt());
                    break;
                    
                    
                    
                    
                case 3:
                    System.out.print("Enter Student Id Search : ");
                    Manger.SearchStu(bk.nextInt());
                    break;
                    
                    
                    
                    
                case 4:
                    Manger.DisplayAll();
                    break;
                    
                    
                    
                case 5:
                    Manger.Display();
                    break;
                    
                case 6:
                    
                    
                default:
            }
        }while(choice != 6);
    }   
}
