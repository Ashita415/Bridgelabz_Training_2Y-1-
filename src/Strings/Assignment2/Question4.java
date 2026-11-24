package Strings.Assignment2;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class Question4 {
    public static void main(String[] args) {

        String fileName = "data.txt";

        try {
            FileInputStream fis = new FileInputStream(fileName);

            InputStreamReader isr = new InputStreamReader(
                    fis, StandardCharsets.UTF_8
            );

            BufferedReader br = new BufferedReader(isr);

            String line;

            System.out.println("File contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

