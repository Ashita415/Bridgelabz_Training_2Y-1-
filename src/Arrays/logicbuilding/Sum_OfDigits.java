package Arrays.logicbuilding;

import java.util.Scanner;

public class Sum_OfDigits {
    public static int Sum(int num,int sum){
        if(num==0)
            return sum;

        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        System.out.println(Sum(num,0));
    }
}
