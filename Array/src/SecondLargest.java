public class SecondLargest {

    static int secLargest(int arr[]){
        int largest = arr[0];
        int secLargest = -1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] < largest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }

    public static void main(String[] args) {
        int arr[] = {10, 10, 10};
        System.out.println(secLargest(arr));
    }

}
