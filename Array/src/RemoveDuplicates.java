import java.util.*;

public class RemoveDuplicates {

    static ArrayList<Integer> removeduplicates(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,1};

        System.out.println(removeduplicates(arr));
    }
}
