package email;

import java.util.Scanner;

public class Email 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();
        
        int atpos = email.indexOf('@');
        int dopos = email.indexOf('.');

        if (atpos != -1 && dopos != -1 && atpos < dopos) 
        {
            System.out.println("Valid Email");
        } 
        else 
        {
            System.out.println("Invalid Email");
        }
    }
    
}
