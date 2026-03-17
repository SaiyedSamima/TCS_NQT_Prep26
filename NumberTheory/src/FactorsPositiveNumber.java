import java.util.ArrayList;
import java.util.Scanner;

public class FactorsPositiveNumber {
    static ArrayList<Integer> positiveDivisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        ArrayList<Integer> res = positiveDivisors(number);
        for(int div : res){
            System.out.print(div+" ");
        }
    }
}
