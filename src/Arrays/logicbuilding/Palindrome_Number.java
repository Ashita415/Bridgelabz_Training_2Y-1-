package Arrays.logicbuilding;

import java.util.Scanner;

public class Palindrome_Number {
    public static int Reverse(int num,int rev){
        if(num==0) return rev;

        while(num>0){
            int lastdigit=num%10;
            num/=10;
            rev=(rev*10)+lastdigit;
        }
        return rev;
    }
    public static boolean isPalindrome(int num,int rev){
        if((Reverse(num,rev))==num) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        System.out.println(isPalindrome(num,0));
    }
}
