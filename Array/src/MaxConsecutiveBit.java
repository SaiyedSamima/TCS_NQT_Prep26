public class MaxConsecutiveBit {

    static int maxConsecBit(int arr[]){
        int count = 1;
        int ans = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                count = 1;
            }

            ans = Math.max(count,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0};
        System.out.println(maxConsecBit(arr));
    }
}
