package Strings.LeetCode;

public class LeetCode_2129 {
    // if string is greater than 3 make first letter in Uppercase
    // otherwise if less then 3 make all of them in letter case.
    //title = "capiTalIze tHe titLe"
    //Capitalize The Title
    public static String capitalizeTitle(String title) {
        String[] word=title.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].length()<=2){
                word[i]=word[i].toLowerCase();

            }else{
                word[i]=word[i].substring(0,1).toUpperCase() + word[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ",word);
    }
    public static void main(String[]args){
        String title="capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }
}
