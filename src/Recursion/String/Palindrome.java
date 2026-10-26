package Recursion.String;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String name, int start, int end){
        if(start>=end){
            return true;
        }
        if(name.charAt(start)!=name.charAt(end)){
            return false;
        }
        return palindrome(name,start+1,end-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();

        System.out.println(palindrome(name,0,name.length()-1));
    }
}