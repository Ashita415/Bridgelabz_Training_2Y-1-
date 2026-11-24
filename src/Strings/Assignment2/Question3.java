package Strings.Assignment2;
import java.io.*;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter word to search: ");
        String target = sc.nextLine();

        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }

            br.close();

            System.out.println("Word '" + target + "' appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

