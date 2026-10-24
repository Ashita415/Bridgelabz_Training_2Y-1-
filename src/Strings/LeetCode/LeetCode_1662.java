package Strings.LeetCode;

public class LeetCode_1662 {
    public static boolean arrayStringEqual(String[] words1, String[] words2){
        String s1="";
        String s2="";
        int index=0;
        while(index<words1.length ||index<words2.length){
            if(index<words1.length){
                s1+=words1[index];
            }
            if(index<words2.length){
                s2+=words2[index];
            }
            index++;
        }
        return s1.equals(s2);
    }
    public static void main(String[]args){
        String words1[] = {"ab", "c"};
        String words2[] = {"a", "bc"};
        System.out.println(arrayStringEqual(words1,words2));
    }
}
