public class BinomialCoefficient {
    static int bionomialCoff(int n , int k){

        if(k > n){
            return 0;
        }
        if( k == 0 || k == n){
            return 1;
        }
        return bionomialCoff(n-1,k-1) + bionomialCoff(n-1,k);
    }
    public static void main(String[] args) {
        System.out.println(bionomialCoff(5,2));
        System.out.println(bionomialCoff(4,1));
    }
}
