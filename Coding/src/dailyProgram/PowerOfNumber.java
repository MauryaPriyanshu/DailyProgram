package dailyProgram;

public class PowerOfNumber {
    public static void main(String[] args){
        int num = 3;
        int power = 4;
        int res = 1;
//        System.out.println((int)Math.pow(num, power));
        while(power != 0){
            res *= num;
            power--;
        }
        System.out.println("Power of the numbre are " + res);
    }
}
