import java.util.*;

public class Replaceelementsbyrank {

    static int[] replaceWithRank(int[] arr, int N){
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        HashMap<Integer,Integer> mp = new HashMap<>(N);

        int  rank = 1;

        for(int i=0; i<N; i++){
            if(!mp.containsKey(tmp[i])){
                mp.put(tmp[i],rank);
                rank++;
            }
        }

        for(int i=0; i<N; i++){
            arr[i] = mp.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};

        replaceWithRank(arr,6);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
