package dailyProgram;

public class FactorOfNumber {
    public static void main(String[] arrs) {
        int num = 6;
        System.out.println("Factor of the number are : ");
        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                System.out.print(i+ ",");
            }

        }
    }
}
