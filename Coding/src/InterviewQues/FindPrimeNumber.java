package InterviewQues;

public class FindPrimeNumber {
    public static void main(String[] args){
        int num = 15;
        int count = 0;
        if (num<2){
            System.out.println("Number is not prime number!");
        }
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("Number is prime!");
        }
        else{
            System.out.println("Number is not prime!");
        }
    }
}
