package InterviewQues;

import static dailyProgram.HighestCommenFactor.gcd;

public class HCF {
    public static void main(String[] args){
        int a = 36;
        int b = 30;
        System.out.println("The HCF of two number are: " +gcd(a,b));
    }
    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
