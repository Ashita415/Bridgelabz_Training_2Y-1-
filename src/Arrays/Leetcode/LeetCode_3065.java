package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_3065 {
    public static int minOperations(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(k>nums[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];

        System.out.print("Enter the element of the Array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k=sc.nextInt();
        System.out.println(minOperations(nums,k));
    }
}
