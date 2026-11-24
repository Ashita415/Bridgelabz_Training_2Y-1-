package Strings.Assignment2;
import java.util.*;
public class Question6 {

    static String linearSearch(String[] sentences, String word) {
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\W+");

            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    return sentences[i];
                }
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];

        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        String result = linearSearch(sentences, word);

        System.out.println("Result: " + result);
    }
}

