package InterviewQues;

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args){
        int count = 10;
        System.out.print("Fibonacci Series are: " + n1 +" ," +n2);
        fibonacci(count-2);
    }
    static int n1 = 0, n2 = 1, sum = 0;
    public static void fibonacci(int count){
        if(count>0){
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
            System.out.print(","+sum);
            fibonacci(count-1);
        }

    }
}
