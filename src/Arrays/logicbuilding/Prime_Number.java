package Arrays.logicbuilding;

import java.util.Scanner;

public class Prime_Number {
    public static boolean isPrime(int num) {
        int count=0;
        if (num < 2) return false;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));
    }
}
