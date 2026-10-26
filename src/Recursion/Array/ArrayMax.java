package Recursion.Array;

import java.util.Scanner;

public class ArrayMax {
    public static int max(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int small=max(arr,index+1);
        return Math.max(small,arr[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max element: "+max(arr,0));
    }
}
