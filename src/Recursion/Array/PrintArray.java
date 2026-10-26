package Recursion.Array;

public class PrintArray {
    public static void printInc(int arr[],int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        printInc(arr,index+1);
    }

    public static void printDec(int arr[],int index){
        if(index==arr.length){
            return;
        }
        printDec(arr,index+1);
        System.out.print(arr[index]+" ");
    }

    public static void main(String[] args) {
        int arr[]={1,2,24,37,51,73};
        printInc(arr,0);
        System.out.println();
        printDec(arr,0);
    }
}
