package dailyProgram;

//The numbers whose ( sum of divisors ) / number ratio is same are known as Friendly Pair Numbers...

public class FriendlyPair {
    public static void main(String[] args){
        int num1 = 6;
        int num2 = 12;
        int sum1 = getDivisor(num1);
        int sum2 = getDivisor(num2);

        if(num1/sum1 == num2/sum2){
            System.out.println("Given number are called friendly number!");
        }
        else{
            System.out.println("Given number is not friendly number!");
        }
    }
    public static int getDivisor(int num){
        int sum = 1;
        for(int i  = 1; i < num; i++){
            if(num%i == 0)
            sum = sum+i;
        }
         return sum;
    }
}
