package Strings.LeetCode;

public class LeetCode_2806 {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100-((purchaseAmount+5)/10)*10;
    }
    public static void main(String[]args){
        int purchaseAmount=9;
        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }
}
