package Arrays.Leetcode;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int result[]=new int[digits.length+1];
        result[0]=1;
        return result;
    }

    public static void display(int[] digits) {
        for (int num : digits) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int digits[]={1,2,2,5};

        display(digits);

        plusOne(digits);
        display(digits);
    }
}
