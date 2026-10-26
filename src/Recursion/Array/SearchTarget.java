package Recursion.Array;

import java.util.Scanner;

public class SearchTarget {
    public static int search(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,index+1,target);
    }

    public static int sum(int arr[],int index){
        if(index==arr.length){
            return 0;
        }
        int add=sum(arr,index+1);
        return arr[index]*add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,0));
        System.out.println("Target Index is: "+search(arr,0,target));
    }
}
