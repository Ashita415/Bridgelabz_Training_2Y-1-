package Arrays.Sliding_Window_Technique;
import java.util.Scanner;

public class MaximumSum {
    public static int MaximumSum(int nums[],int size){
        int sum=0;
        int maxSum=0;
        for(int i=0;i<size;i++) {
            sum += nums[i];
        }
        maxSum=sum;
        for(int i=1;i<nums.length-size;i++){
            sum=sum-nums[i-1]+nums[i+size-1];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];

        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.print(MaximumSum(nums,size));
    }
}
