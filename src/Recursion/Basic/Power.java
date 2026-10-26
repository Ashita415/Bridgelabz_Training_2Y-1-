package Recursion.Basic;

public class Power {
    public static int powerOfNumber(int p,int q){
        if(q==0){
            return 1;
        }
        return p*powerOfNumber(p,q-1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(5,4));
    }
}
