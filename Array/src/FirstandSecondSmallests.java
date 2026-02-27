import java.util.*;

public class FirstandSecondSmallests {


   static ArrayList<Integer> minand2ndmin(int arr[]){

        ArrayList<Integer> res = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min ){
                secmin = min;
                min = arr[i];
            }
            else if( arr[i] < secmin && arr[i] != min){
                secmin = arr[i];
            }
        }

        if(secmin == Integer.MAX_VALUE){
            res.add(-1);
        }
        else{
            res.add(min);
            res.add(secmin);
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[] = {2,2,2};

        System.out.println(minand2ndmin(arr));

    }
}
