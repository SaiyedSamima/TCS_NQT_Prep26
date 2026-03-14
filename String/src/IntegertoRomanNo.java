public class IntegertoRomanNo {
    static String IntToRoman(int n){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder res = new StringBuilder();

        for(int i=0; i<n; i++){
            while(n >= values[i]){
                res.append(roman[i]);
                n -= values[i];
            }
        }
        return  res.toString();
    }
    public static void main(String[] args) {
        System.out.println(IntToRoman(1010));
    }
}
