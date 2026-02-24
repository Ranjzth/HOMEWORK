package sunfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SunFromFile {
    public static void main(String[] args) {

        try {
            File file = new File("numbers.txt");

            Scanner sc = new Scanner(file);
            int sum = 0;

           
            while (sc.hasNext()) 
            {
                if (sc.hasNextInt())
                {
                    sum += sc.nextInt();
                } 
                else 
                {
                    sc.next();
                }
            }

            sc.close();
            System.out.println("Sum of numbers in file = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}