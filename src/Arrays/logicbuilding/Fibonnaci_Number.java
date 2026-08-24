package Arrays.logicbuilding;

import java.util.Scanner;

public class Fibonnaci_Number {
    static int a=0;
    static int b=1;
    public static void Fibonnaci(int num){
        if(num>0){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            Fibonnaci(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        Fibonnaci(num);
    }
}
