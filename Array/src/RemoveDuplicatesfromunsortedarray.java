import java.util.*;

public class RemoveDuplicatesfromunsortedarray {
    static ArrayList<Integer> RemoveDuplicates(int arr[]){

        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

            if(mp.get(arr[i]) == 1){
                res.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 2};
        System.out.println(RemoveDuplicates(arr));
    }
}
