package longestwordinfile;

import java.io.*;
import java.util.*;

public class LongestWordInFile {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            String longestWord = "";

            // Read file line by line
            while ((line = br.readLine()) != null) {
                
                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            br.close();

            if (!longestWord.isEmpty()) {
                System.out.println("Longest word: " + longestWord);
                System.out.println("Length: " + longestWord.length());
            } else {
                System.out.println("File is empty or no words found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}