package Arrays.Leetcode;

public class Build_Array {
    public static int[] buildArray(int[] nums) {
        int[]ans=new int[nums.length];
        return call(nums,ans,0);

    }
    public static int[] call(int[] nums,int[] arr,int i){
        if(i==nums.length) return arr;
        arr[i]=nums[nums[i]];
        return call(nums,arr,i+1);
    }

    public static void display(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {0,2,1,5,3,4};

        display(nums);
        int ans[] = buildArray(nums);
        display(ans);
    }
}
