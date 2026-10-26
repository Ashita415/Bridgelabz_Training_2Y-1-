package Arrays.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int nums[]){
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
}
