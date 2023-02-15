package dailyProgram;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 2321;
        int rev = 0;
        int temp = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Number is palindrome");
        } else
            System.out.println("Number is not palindrome!");
    }
}
