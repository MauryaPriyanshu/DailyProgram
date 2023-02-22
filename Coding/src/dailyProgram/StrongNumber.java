package dailyProgram;

public class StrongNumber {
    public static void main(String[] args){
        int num = 150;
        int mul = 1;
        int sum = 0;
        int temp = num;
        while(num != 0){
            int rem = num%10;
            sum = sum+ fact(rem);
            num = num/10;

        }
        if(sum == temp)
        System.out.println("Given Number is strong number!");
        else
            System.out.println("Given number is not strong number!");
    }
    public static int fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
