package numericquestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check wheather its palindrome or not");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        System.out.println(num + (result?" is palindrome" : " is Not Palindrome"));
        //  System.out.println(num +" is "+ (checkEvenOdd(num) ?"EVEN" : "ODD"));
    }
    public static boolean isPalindrome(int num){
    
        if(num == reverse(num)){
            return true;
        }
        return false;
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
