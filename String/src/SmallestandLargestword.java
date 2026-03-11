import java.util.ArrayList;

public class SmallestandLargestword {
    static ArrayList<String> smallerAndLarger(String s){
        String[] words = s.trim().split("\\s+");

        String minWord = words[0];
        String maxWord = words[0];

        for(String word : words){
            if(word.length() < minWord.length()){
                minWord  = word;
            }

            if(word.length() >= maxWord.length()){
                maxWord = word;
            }
        }

        ArrayList<String> ans = new ArrayList<>();

        ans.add(minWord);
        ans.add(maxWord);

        return ans;
    }
    public static void main(String[] args) {

        System.out.println(smallerAndLarger("water WATER evEry WHere BUT nor a Drop to Drink"));
    }
}
