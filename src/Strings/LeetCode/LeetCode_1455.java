package Strings.LeetCode;

public class LeetCode_1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String result[] = sentence.split(" ");
        for (int i = 0; i < result.length; i++) {
            if (result[i].startsWith(searchWord)) {
                return i + 1;
            }

        }
        return -1;
    }
    public static void main(String[]args){
        String sentence = "i love eating burger", searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence,searchWord));
    }
}
