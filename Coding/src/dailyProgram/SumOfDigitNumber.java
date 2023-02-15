package dailyProgram;

public class SumOfDigitNumber {
    public static void main(String[] args){

        int num = 234589;
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("Sum the digit of the given number is :" + sum);
    }
}
