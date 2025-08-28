package numericquestions;
import java.util.Scanner;;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int result = getDigitCount(digit);
        System.out.println("count for the input is: "+ result);
        ;
    }
    public static int getDigitCount(int num){
        int count = 0;
        while(num!=0)
        {
            num = num / 10;
            count++;
        }
        return count;
    }
    
}
