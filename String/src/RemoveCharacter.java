import java.util.HashMap;

public class RemoveCharacter {
    static String removeChar(String s1, String s2){
        HashMap<Character,Integer> s = new HashMap<>();

        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            s.put(ch,s.getOrDefault(s,0)+1);
        }

        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
             if(! s.containsKey(ch)){
                 ans.append(ch);
             }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s1 = new String("computer");
        String s2 = new String("cat");
        System.out.println(removeChar(s1,s2));
    }
}
