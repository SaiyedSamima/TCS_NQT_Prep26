public class MeanOFArray {
    public static int Mean(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
           sum = sum+arr[i];
        }
        int mean = sum/n;
        return mean;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 6, 5, 8, 7};
        System.out.println(Mean(arr));
    }
}
