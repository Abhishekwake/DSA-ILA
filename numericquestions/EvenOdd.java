package numericquestions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no to check even or odd");
        int num = sc.nextInt();
        boolean result = checkEvenOdd(num);
        System.out.println(num +" is "+ (checkEvenOdd(num) ?"EVEN" : "ODD"));

    }
    public static boolean checkEvenOdd(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
