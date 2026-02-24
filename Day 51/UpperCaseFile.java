package uppercasefile;

import java.io.*;

public class UpperCaseFile {
    public static void main(String[] args) {

        try {
         
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);


            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String line;

         
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }

            
            br.close();
            bw.close();

            System.out.println("File converted to uppercase successfully!");

        } catch (IOException e) {
            System.out.println("Error handling file!");
        }
    }
}