package Arrays.logicbuilding;
import java.util.Scanner;

public class Armstrong_Number {
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean isArmstrong(int n){
        int ori=n;
        int d=count(n);
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=(int)(Math.pow(rem,d));
            n/=10;
        }
        if(ori==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        System.out.println(isArmstrong(n));
    }
}

