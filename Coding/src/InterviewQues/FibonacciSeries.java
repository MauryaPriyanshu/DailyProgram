package InterviewQues;

// Write a java program without using recursion....
public class FibonacciSeries {
    public static void main(String[] ags){
        int a = 0;
        int b = 1;
        int count = 15;
        int c;
        System.out.println("Fibonacci series are : ");
        System.out.print(a + "," + b);
        for(int i = 2; i <= count; i++) {
            c = a + b;
            System.out.print("," +c);
            a = b;
            b = c;
        }
    }
}
