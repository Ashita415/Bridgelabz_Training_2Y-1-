package Strings.logicbuilding;

import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    String result = new StringBuilder(str).reverse().toString();

    if(result.equals(str))

    {
        System.out.println(str + " is palindrome");
    }
    else

    {
        System.out.println(str + " is not palindrome");
    }
}
}
