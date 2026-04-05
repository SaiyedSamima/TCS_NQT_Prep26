import java.util.Scanner;
public class ReplaceANumber {
    static int convertFive(int num){
        if(num == 0){
            return 5;
        }
        int place = 1;
        int result = 0;

        while(num > 0){
            int digit = num % 10;
            if(digit == 0){
                digit = 5;
            }
            result += digit * place;
            place *= 10;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertFive(num));
    }
}
