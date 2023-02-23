package dailyProgram;

public class PerfectNumber {

    //A Number that can be represented as the sum of
    // it's factors except the number itself is known as the Perfect Number.
    public static void main(String[] args){
        int num = 8;
        int sum = 0;
        int temp = num;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }

        }
        if(temp == sum){
            System.out.println("Given number is perfect number!");
        }
        else{
            System.out.println("Given number is not perfect number!");
        }

    }
}
