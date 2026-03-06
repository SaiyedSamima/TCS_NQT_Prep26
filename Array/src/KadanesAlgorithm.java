public class KadanesAlgorithm {

    static int maxSubArraySum(int[] arr){

        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            sum = Math.max(sum, arr[i]);
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};

        System.out.println(maxSubArraySum(arr));
    }
}
