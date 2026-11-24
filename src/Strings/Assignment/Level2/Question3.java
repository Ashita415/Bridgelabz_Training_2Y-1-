package Strings.Assignment.Level2;
import java.util.*;
public class Question3 {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int n = findLength(text);
        int wordCount = 0;

        boolean inWord = false;

        for (int i = 0; i < n; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int[] start = new int[wordCount];
        int[] end = new int[wordCount];

        int index = 0;
        inWord = false;

        for (int i = 0; i < n; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                start[index] = i;
                inWord = true;
            }

            if (text.charAt(i) == ' ' && inWord) {
                end[index] = i;
                index++;
                inWord = false;
            }
        }

        if (inWord) {
            end[index] = n;
        }

        for (int i = 0; i < wordCount; i++) {
            String word = "";

            for (int j = start[i]; j < end[i]; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
        }

        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);

            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = getWordLengths(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.parseInt(result[i][1]);

            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}

