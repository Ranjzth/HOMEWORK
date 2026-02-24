package writedatatofile;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class WriteDataToFile {
    public static void main(String[] args) {

        try {
            // Get today's date
            LocalDate today = LocalDate.now();

            // Write date into file
            FileWriter writer = new FileWriter("today.txt");
            writer.write("Today's date is: " + today);
            writer.close();

            System.out.println("Date written to file successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }
}