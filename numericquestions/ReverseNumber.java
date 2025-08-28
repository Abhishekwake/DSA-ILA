package numericquestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = sc.nextInt();
        int result = reverse(num);
        System.out.println("Number after reverse is " + result);
    }    
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            int digit = num % 10; //to find the last digit
            rev = rev * 10 + digit; // append digit
            num = num / 10; //remove last digit
        }
        return rev;
    }
}
