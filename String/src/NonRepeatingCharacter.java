import java.util.HashMap;
public class NonRepeatingCharacter {
    static char nonRepeatingChar(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq.get(ch) == 1){
                return ch;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "aabbcdeeff";
        System.out.println(nonRepeatingChar(s));
    }
}
