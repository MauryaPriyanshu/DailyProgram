package dailyProgram;

public class TribonacciSeries {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Print the tribonacci series :" + tribonacci(3));

    }
    public static int tribonacci(int n){
        int t0 = 0, t1 = 1, t2 = 1;
        int tn = 0;
        if(n == 0){
          return 0;
        }
        if(n == 1|| n==2){
            return 1;
        }
        for(int i = 3; i <= n; i++){
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return tn;
    }
}
