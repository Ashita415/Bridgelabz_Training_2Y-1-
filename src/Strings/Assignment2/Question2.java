package Strings.Assignment2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < n; i++) {
            result.append(arr[i]);
        }

        System.out.println("Concatenated string: " + result);
    }
}

