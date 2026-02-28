

public class EqualSum {
    static String equilibrium(int[] arr){
        int n = arr.length;

        int[] prefix = new int[n+1];
        prefix[0] = 0;

        for(int i=1; i<=n;i++){
            prefix[i] = prefix[n-1] + arr[n-1];
        }

        int sum = 0;
        for(int i=n-1;i>=0;i--){
            if(prefix[i] == sum) return "true";
            sum += arr[i];
        }
        return "false";
    }


    public static void main(String[] args){
        int arr[] = {1, 2};

        System.out.println(equilibrium(arr));

    }
}
