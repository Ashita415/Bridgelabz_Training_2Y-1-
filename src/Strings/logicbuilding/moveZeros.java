package Strings.logicbuilding;
import java.sql.SQLOutput;
import java.util.*;

public class moveZeros {
    public static int[] movezeros(int nums[]) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int []nums= new int[n];

        System.out.print("Enter Array: ");
        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(movezeros(nums)));
    }
}
