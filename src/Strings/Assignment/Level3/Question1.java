package Strings.Assignment.Level3;
import java.util.*;
public class Question1 {

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

    public static char[] findUniqueCharacters(String text) {
        int n = findLength(text);

        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count] = text.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] result = findUniqueCharacters(text);

        System.out.println("Unique characters:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

