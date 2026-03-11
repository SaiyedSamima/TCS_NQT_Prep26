public class CountAlphabets {

    static int countAlp(String s){
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abh%^*()jfj234";
        System.out.println(countAlp(s));
    }
}
