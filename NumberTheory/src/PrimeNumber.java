import java.util.ArrayList;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> PrimeRange(int M, int N){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(25));

        System.out.println(PrimeRange(1,10));
    }
}
