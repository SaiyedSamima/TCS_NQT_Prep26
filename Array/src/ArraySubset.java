import java.util.Arrays;

public class ArraySubset {

    static boolean isSubset(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int i=0;
        int j=0;

        while(i< a.length && j<b.length){
            if(a[i] == b[j]){
                i++;
                j++;
            }
            else{
                i++;
            }

        }
        if(j == b.length) return true;
        return false;
    }


    public static void main(String[] args){
        int a[] = {1,22,5,3,7,4,2};
        int b[] = {1,4,3};

        System.out.println(isSubset(a,b));

    }

}
