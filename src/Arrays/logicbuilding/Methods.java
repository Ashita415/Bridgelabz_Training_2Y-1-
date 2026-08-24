package Arrays.logicbuilding;

public class Methods {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: "+ add(10,5));
        System.out.println("Subtraction: "+ sub(10,5));
        System.out.println("Multiplication: "+ mul(10,5));
    }
}
