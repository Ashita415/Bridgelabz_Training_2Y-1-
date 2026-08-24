package Arrays.logicbuilding;

import java.util.Scanner;
public class Calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
    public static void main(String args[])
    {
        System.out.println("1 for Addition");
        System.out.println("2 for Substraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:- ");
        int a=sc.nextInt();
        System.out.print("Enter number 2:- ");
        int b=sc.nextInt();
        Calculator C1 = new Calculator();
        while(true)
        {
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    int addition=C1.add(a,b);
                    System.out.println("Addition of two numbers:- "+addition);
                    break;
                case 2:
                    int substraction=C1.sub(a,b);
                    System.out.println("Substraction of two numbers:- " +substraction);
                    break;
                case 3:
                    int multiplication = C1.mul(a,b);
                    System.out.println("Multiplication of two numbers:- "+multiplication);
                    break;
                case 4:
                    int division=C1.div(a,b);
                    System.out.println("Division of two numbers:- "+division);
                    break;
                default:
                    System.out.print("Invalid");
                    break;
            }
        }
    }
}
