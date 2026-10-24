package Arrays.Leetcode;
import java.util.*;

public class LeetCode_1299 {
        public static int[] replaceElements(int[] arr) {
            int max=-1;
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>max){
                    int temp=arr[i];
                    arr[i]=max;
                    max=Math.max(max,temp);
                }
                else{
                    arr[i]=max;
                }
            }
            return arr;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the element of the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(replaceElements(arr)));
    }
}
