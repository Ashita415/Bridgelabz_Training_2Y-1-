package Arrays.Leetcode;

public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void display(int[] digits,int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=3;

        System.out.print("Original Array: ");
        display(nums, nums.length);

        int k = removeElement(nums, val);

        System.out.print("After Removing: ");
        display(nums, k);

        System.out.println("Remaining Elements Count: " + k);
    }
}
