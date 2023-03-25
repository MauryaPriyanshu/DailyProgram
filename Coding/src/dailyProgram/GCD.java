package dailyProgram;

public class GCD {
    public static void main(String[] args){
        int num1 = 30;
        int num2 = 36;
        System.out.println("gcd of the two number is : " + gcd(num1,num2));
    }

    private static int gcd(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
//        return gcd(num2, num1%num2);
        if(num1 == 0){
            return num2;
        }
        if(num1 == num2){
            return num1;
        }
        if(num1 > num2){
            return gcd(num1-num2, num2);
        }
        return gcd(num1, num2-num1);
    }
}
