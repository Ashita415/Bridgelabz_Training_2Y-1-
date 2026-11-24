package Strings.Assignment.Level3;
import java.util.*;
public class Question3 {

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (frequency[ch] > 0) {
                count++;
                frequency[ch] = -frequency[ch];
            }
        }

        String[][] result = new String[count][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (frequency[ch] < 0) {
                result[--count][0] = String.valueOf(ch);
                result[count][1] = String.valueOf(-frequency[ch]);
                frequency[ch] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        String[][] result = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}

