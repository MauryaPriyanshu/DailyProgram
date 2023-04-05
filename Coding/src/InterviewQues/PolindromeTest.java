package InterviewQues;

public class PolindromeTest {
    public static void main(String[] args){
        String str = "madam";
        String temp = str;
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
       
        if(str.equals(rev)){
            System.out.println("String is palindrom");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
