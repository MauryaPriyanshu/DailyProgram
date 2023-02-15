package dailyProgram;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num < 2){
            isPrime = false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        String ans = isPrime ? "Prime" : "Not Prime";
        System.out.println("The number "+num+ " is "+ ans);
    }
}
