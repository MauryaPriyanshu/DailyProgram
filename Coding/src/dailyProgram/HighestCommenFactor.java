package dailyProgram;

public class HighestCommenFactor {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 6;
        System.out.println("Highest commen factor of two number is "+ gcd(num1,num2));
    }
    public static int gcd(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        else {
            return gcd(num2, num1 % num2);
        }
    }
}
