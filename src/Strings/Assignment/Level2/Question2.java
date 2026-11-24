package Strings.Assignment.Level2;
import java.util.*;
    public class Question2 {

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

        public static boolean compareArrays(String[] arr1, String[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }

            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String text = sc.nextLine();

            String[] result1 = splitWords(text);
            String[] result2 = text.trim().isEmpty()
                    ? new String[0]
                    : text.trim().split("\\s+");

            System.out.println("Words using user-defined method:");
            System.out.println(Arrays.toString(result1));

            System.out.println("Words using split():");
            System.out.println(Arrays.toString(result2));

            if (compareArrays(result1, result2)) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Both results are different.");
            }

            sc.close();
        }
    }
