import java.util.*;

public class Countdistinctelementsineverywindow {

    static ArrayList<Integer> countDistict(int arr[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            if(i >= k){
                int left_emelent = arr[i-k];
                map.put(left_emelent, map.get(left_emelent)-1);

                if(map.get(left_emelent) == 0){
                    map.remove(left_emelent);
                }
            }

            if(i >= k-1){
                ans.add(map.size());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int arr1[] = {1, 1, 1, 1, 1};
        int arr2[] = {4, 1, 1};
        System.out.println(countDistict(arr,4));
        System.out.println(countDistict(arr1,3));
        System.out.println(countDistict(arr2,2));

    }
}
