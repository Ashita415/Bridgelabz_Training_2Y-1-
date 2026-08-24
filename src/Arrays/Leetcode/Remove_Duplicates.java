package Arrays.Leetcode;

public class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return ++j;
    }

    public static void display(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 2, 3};

        System.out.print("Original Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        int k = removeDuplicates(nums);

        System.out.print("\nAfter Removing Duplicates: ");
        display(nums, k);

        System.out.println("K= " + k);
    }
}
