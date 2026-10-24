package Strings.logicbuilding;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        str.append("Ashita");
        System.out.println("Append Method: "+str);
        str.insert(5,'x');
        System.out.println("Insert Method: "+str);
        str.reverse();
        System.out.println("Reverse Method: "+str);
        str.delete(2,5);
        System.out.println("Delete Method: "+str);
        str.deleteCharAt(1);
        System.out.println("Delete charAt Method: "+str);
        str.replace(2,2,"a");
        System.out.println("Replace Method: "+str);
    }
}
