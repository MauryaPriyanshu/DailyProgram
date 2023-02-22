package dailyProgram;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        //       int mul = 1;
//        Iterative Method
//        for(int i = 1; i <= num; i++){
//            mul = mul * i;
//        }
       System.out.println("Factorial of the " + num + " is " + factorial(num));

    }



// Recursive Method
        public static int factorial(int num){
            if (num == 0) {
                return 1;
            }
        else{
            return num*factorial(num-1);
            }
    }
}
