// FIND THE NUMBER IS PRIME OR NOT**************
package dailyProgram;

public class PrimeNumber {
    //PRIME NUMBERS ARE THOSE NUMBERS WHICH DIVISIBLE BY ONE AND INTSELF(EG. 2,3,5,7,11,13,17.......)
    public static void main(String[] args){
        int num = 14;
        int count = 0;
        if(num < 2){
            System.out.println(num + " is not prime number!");
        }
        for(int i = 1; i < num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println(num + " is not prime number!!");
        }
        else{
            System.out.println(num + " is prime number!");
        }
    }
}
