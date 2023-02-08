package dailyProgram;

public class fibonacciSeries {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c, count = 10;
        System.out.print("print the fibonacci series:" + a + " " + b + " ");
        for(int i = 2; i <= count; i++){
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
