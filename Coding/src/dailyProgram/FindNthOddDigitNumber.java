package dailyProgram;

//Given an integer N, You need to find the Nth smallest number which only contains odd digits
// i.e. 1,3,5,7,9 means no even digits are allowed on that number (12 will not consider).
// For example, the starting numbers which only contain odd digits are
// 1,3,5,7,9,11,13,15,17,19,31,33,35 and so on.
public class FindNthOddDigitNumber {
    public static void main(String[] args) {
        int N = 3;
        System.out.println("The " + N + " th odd digit number is:" + findNthOddDigitNumber(N));
    }


    public static long findNthOddDigitNumber(long n) {
        int count = 0;
        for (int i = 1; ; i++) {
            int num = i;
            boolean isFindOdd = true;
            while (num != 0) {
                if (num % 10 == 2 || num % 10 == 4 || num % 10 == 6 || num % 10 == 8) {
                    isFindOdd = false;
                    break;
                }
                num = num / 10;
            }
            if (isFindOdd == true)
                count++;
            if (count == n)
                return i;
        }
    }
}


