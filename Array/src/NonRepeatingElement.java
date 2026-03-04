import java.util.HashMap;

public class NonRepeatingElement {

    static int firstNonRepeating(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            mp.put(key,mp.getOrDefault(key,0)+1);
        }

        for(int i=0; i<arr.length; i++){
            if(mp.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int arr[] = {-1, 2, -1, 3, 2};
        System.out.println(firstNonRepeating(arr));
    }

}
