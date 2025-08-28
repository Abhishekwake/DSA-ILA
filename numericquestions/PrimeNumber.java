package numericquestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check wheather its prime or not");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        System.out.println(num + (result?" IS Prime.":" IS not prime" ));
    }
    public static boolean isPrime(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
}
// A number that can be divided exactly only by itself and 1, for example 7, 17 and 41
