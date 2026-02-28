public class RotateArray {

    static void rotateArr(int[] arr, int d){
        int n = arr.length;
        d = d%n;

        int i = 0;
        int j = d-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }


        i = d;
        j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        i = 0;
        j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int arr[] = {7, 3, 9, 1};
        rotateArr(arr,9);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
