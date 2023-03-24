package InterviewQues;

import static dailyProgram.FactorialNumber.factorial;

public class FactorialNumber {
    public static void main(String[] args){
        int result = factorial(5);
        System.out.println("Factorial of 5 is :"+ result);
    }
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        else {
            return (num * factorial(num - 1));
        }
    }
}
