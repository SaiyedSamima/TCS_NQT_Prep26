public class PalindromeString {
    static boolean palindrome(String s){
        int i = 0;
        int j = s.length() -1;

        while(i<j){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {

        String s = new String("ababa");
        System.out.println(palindrome(s));
        System.out.println(palindrome("abba"));
        System.out.println(palindrome("abc"));
    }
}
