import java.util.Arrays;

public class SortaString {
    static String sort(String s){
       char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "edcab";
        System.out.println(sort(s));
    }
}
