package Arrays.hashmap;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3,1,2,3,4,5,6,7};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int freq: arr){
            map.put(freq,map.getOrDefault(freq,0)+1);
        }
        System.out.println(map);
    }
}
