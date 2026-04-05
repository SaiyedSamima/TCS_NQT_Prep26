public class StrongNumbers {
    static int isFact(int N){
        int[] fact = new int[10];
        fact[0] = 1;
        for(int i=1;i<10;i++){
            fact[i] = fact[i-1] * i;
        }

        int original = N;
        int sum = 0;

        while(N>0){
            int digit = N%10;
            sum = sum + fact[digit];
            N /= 10;
        }
        return (sum == original) ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(isFact(145));
        System.out.println(isFact(14));
    }
}
