import java.util.*;

public class FrequenciesLimitedArray {

    static List<Integer> frequencyCount(int[] arr){
        int n = arr.length;
        int freq[] = new int[n];
        freq[0] = 0;

        for(int i=0; i<n; i++){
            int key = arr[i];
            freq[key-1]++;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            res.add(freq[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};

        System.out.println(frequencyCount(arr));
    }
}
