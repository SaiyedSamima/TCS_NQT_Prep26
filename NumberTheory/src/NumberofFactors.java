public class NumberofFactors {
    static int countFactors(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                if(n/i == i){
                    count++;
                }
                else{
                    count += 2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countFactors(5));
        System.out.println(countFactors(25));
    }
}
