package dailyProgram;

public class AutomarphicNumber {
    public static void main(String [] argfs){
        int num = 8;
        int mul = num*num;
        int rem = mul%10;
        if(num == rem){
            System.out.println("Given number is automarphic number!");
        }
        else{
            System.out.println("Given number is not automarphic number!");
        }
    }
}
