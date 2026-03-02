import java.util.Arrays;

public class MedianArray {

    static double medianArray(int[] arr){

        int n = arr.length;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){

            if(n%2 != 0){
                return arr[n/2];
            }
        }
        return (arr[n/2 - 1] + arr[n/2])/2.0;
    }
    public static void main(String[] args) {
        int arr[] = {90, 100, 78, 89, 67};

        System.out.println(medianArray(arr));
    }
}
