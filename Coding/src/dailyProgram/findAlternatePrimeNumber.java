package dailyProgram;

public class findAlternatePrimeNumber {
    public static void main(String[] args) {
        int num1 = 100000;
        System.out.println("print the alternate prime number till the range of:" + num1 );
        altPrimeNumber(num1);
    }

        public static void altPrimeNumber(int num1){
        int temp = 0;
        for (int i = 2; i < num1; i++) {
            if (isPrime(i) == 1) {

                if (temp % 2 == 0) {
                    System.out.print(i + ",");
                }
                    temp++;

            }

        }

    }
    public static int isPrime(int num){
        int count = 0;
//        if (num < 2)
//            return 0;
        for(int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if(count >= 1){
                return 0;
            }

                return 1;


    }

}


