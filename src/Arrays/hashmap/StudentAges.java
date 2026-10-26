package Arrays.hashmap;

import java.util.HashMap;

public class StudentAges {
    public static void main(String[] args) {
        HashMap<String,Integer> studentAges=new HashMap<>();
        studentAges.put("Rahul",21);
        studentAges.put("Mayank",22);
        studentAges.put("Ayushi",20);

        System.out.println("Ayushi's age: "+studentAges.get("Ayushi"));
        System.out.println("Rahul's age: "+studentAges.get("Rahul"));
        System.out.println("Mayank's age: "+studentAges.get("Mayank"));

        boolean hasMayank=studentAges.containsKey("Mayank");
        System.out.println(hasMayank);
        boolean hasAge20=studentAges.containsValue(20);
        System.out.println(hasAge20);
    }
}
