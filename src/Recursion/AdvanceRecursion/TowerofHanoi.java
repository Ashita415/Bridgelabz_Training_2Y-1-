package Recursion.AdvanceRecursion;

public class TowerofHanoi {
    public static void tho(int n,char source, char helper,char destination){
        if(n==1){
            System.out.println("Move disk1 from "+source+" to "+destination);
            return;
        }
        tho(n-1,source,destination,helper);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        tho(n-1,helper,source,destination);
    }

    public static void main(String[] args) {
        int n=3;
        tho(n,'A','B','C');
    }
}
