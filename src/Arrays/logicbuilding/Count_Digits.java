package Arrays.logicbuilding;

import java.util.Scanner;

public class Count_Digits {
    public static int countDigits(int n){
        int count=0;
        while(n>0){
           int lastdigit=n%10;
           n/=10;
           count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println(countDigits(n));
    }
}
