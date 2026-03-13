import java.util.HashMap;

public class MostFrequentCharacter {

    static char getFreqChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int maxfreq = 0;
        char res = 'z';

        for(char ch : map.keySet()){
            int freq = map.get(ch);

            if(freq > maxfreq || (freq == maxfreq && ch < res)){
                maxfreq = freq;
                res = ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getFreqChar("testsample"));
        System.out.println(getFreqChar("output"));
    }
}
