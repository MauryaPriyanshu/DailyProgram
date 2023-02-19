package dailyProgram;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int count = order(num);
        checkArmstrong(num,count);
    }
        public static int order(int num) {
            int count = 0;
            while(num > 0) {

                num = num/10;
                count++;
            }
            return count;
        }
        public static void checkArmstrong(int num, int count){
        double sum = 0;
        int temp =  num;
        while(num > 0){
            int rem = num%10;
            sum = sum + pow(rem,count);
            num = num/10;
        }
            if(sum == temp){
                System.out.println("Given Number is armstrong!");
            }
            else{
                System.out.println("Given number is not armstrong!");
            }
    }
}
