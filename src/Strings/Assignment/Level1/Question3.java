package Strings.Assignment.Level1;
import java.util.*;
public class Question3 {

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] result1 = getCharacters(text);
        char[] result2 = text.toCharArray();

        System.out.println("Characters using user-defined method:");
        System.out.println(Arrays.toString(result1));

        System.out.println("Characters using toCharArray():");
        System.out.println(Arrays.toString(result2));

        if (compareArrays(result1, result2)) {
            System.out.println("Both character arrays are equal.");
        } else {
            System.out.println("Both character arrays are different.");
        }

        sc.close();
    }
}

