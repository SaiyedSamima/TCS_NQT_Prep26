import java.util.Scanner;

public class MaxSumSubarraysizeK {

    static int maxSubarraysum(int arr[], int k){
        int n = arr.length;
        int sum = 0;
        int ans = 0;

        for(int i=0 ; i<n; i++){
            sum = sum + arr[i];

            if(i >= k){
                sum -= arr[i-k];
            }
            if(i >= k-1){
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }

    static int maxsum(int arr[], int k){
        int n = arr.length;
        int sum = 0;
        int ans = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        ans = sum;

        for(int i=k; i<n; i++){
            sum += arr[i];
            sum -= arr[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Output: ");
//        System.out.println(maxSubarraysum(arr,2));
        System.out.println(maxsum(arr,2));
    }
}
