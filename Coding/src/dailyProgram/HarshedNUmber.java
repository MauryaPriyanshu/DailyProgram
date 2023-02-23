package dailyProgram;

// HARSHED NUMBER : Harshed nuber is a number that is divisible by sum of its digit...
public class HarshedNUmber {
    public static void main(String[] args){
        int num = 21;
        int sum = 0;
        int rem = num%10;
        sum += rem;
        if(num%rem == 0){
            System.out.println("Given number is Harshed number!");
        }
        else{
            System.out.println("Given number is not Harshed number!");
        }
    }
}
