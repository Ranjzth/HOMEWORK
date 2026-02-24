package removeextraspaces;

import java.io.*;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            
            while ((line = br.readLine()) != null) {
                
                
                line = line.trim().replaceAll("\\s+", " ");
                
                
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Extra spaces removed successfully!");

        } catch (IOException e) {
            System.out.println("Error processing file!");
        }
    }
}