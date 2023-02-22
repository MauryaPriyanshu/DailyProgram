package dailyProgram;

public class FactorOfNumber {
    public static void main(String[] arrs) {
        int num = 6;
        System.out.println("Factor of the number are : ");
//        for(int i = 1; i <= num; i++){
//            if(num%i == 0){
//                System.out.print(i+ ",");
//            }
//
//        }
        getFactor(num);

    }
    public static void getFactor(int num){
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0){
                System.out.print(i + " ,");
            }
        }
        System.out.print(num);
    }
}
