package InterviewQues;

//Swap the number without using third variable
public class SwapNumber {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 12;
        System.out.println("Before swaping the number: " + num1 + " " + num2);
        num1 = num1 + num2 ;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swaping the number: " +num1+ " " +num2 );
    }
}
