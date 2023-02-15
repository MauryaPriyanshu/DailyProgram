package dailyProgram;

// FIND THE PRIME NUMBER IN THE GIVEN RANGE ************
public class FindPrimeInRange {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 30;
        for(int i = num1; i <= num2; i++){
            if(isPrime(i)){
                System.out.print(i + " ,");
            }
        }
        System.out.println();

    }
    public static boolean isPrime(int num){
        int count = 0;
        if(num < 2){
            return false;
        }
        for(int i = 1; i <= num; i++){
            if(num%i == 0)
                count++;
        }
        if(count > 2) {
            return false;
        }

        return true;
    }
}
