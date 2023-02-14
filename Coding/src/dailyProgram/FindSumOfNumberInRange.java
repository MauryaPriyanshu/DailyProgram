package dailyProgram;

public class FindSumOfNumberInRange {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 50;
        int sum = 0;
        System.out.println("Print the sum of the number in the range " + num1 + " to" + num2);
        for(int i = num1; i <= num2; i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
