//Remove all characters other than alphabets
public class RemoveCharactersThanAlphabets {
    static String removeSpecialCharacters(String s){
        StringBuilder ans = new StringBuilder();


        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                ans.append(ch);
            }
        }


        if(ans.length() == 0) return "-1";
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = new String("$Gee*k;s..fo, r'Ge^eks?");
        System.out.println(removeSpecialCharacters(s));
        System.out.println(removeSpecialCharacters("{{{}}> *& ^%*)"));


    }
}
