package dailyProgram;

import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number :");
        int binary = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while(binary > 0){
            int rem = binary%10;
            decimal = decimal + (int)(rem * Math.pow(2, n));
            binary = binary/10;
            n++;
        }
        System.out.println("Print the Binary to Decimal : " + decimal);
    }
}
