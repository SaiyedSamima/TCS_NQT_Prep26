public class RemoveVowelsfromString {
    static String removeVowel(String s){
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            ans.append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args) {

        String s = new String("what is your name");

        System.out.println(removeVowel(s));
    }
}
