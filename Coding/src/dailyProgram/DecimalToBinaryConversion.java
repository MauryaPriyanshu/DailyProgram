package dailyProgram;

public class DecimalToBinaryConversion {
    public static void main(String[] args){
        int decimal = 12;
        int[] binary = new int[20];
        int n = 0;
        while(decimal > 0){
            int rem = decimal%2;
            binary[n++] = rem;
            decimal = decimal/2;
        }
        System.out.println("Decimal to Binary Conversion is : ");
        for(int j = n-1; j >= 0; j--){
            System.out.print(binary[j] + " ");
        }
    }
}
