package Recursion.String;

import java.util.Scanner;

public class Print {
    public static void print(String name, int index){
        if(index==name.length()){
            return;
        }
        System.out.print(name.charAt(index));
        print(name,index+1);
    }

    public static void printDec(String name, int index){
        if(index==name.length()){
            return;
        }
        printDec(name,index+1);
        System.out.print(name.charAt(index));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        print(name,0);
        System.out.println();
        printDec(name,0);
    }
}
