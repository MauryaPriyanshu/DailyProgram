// write a program to check string contains vowels or not.....

package InterviewQues;

public class StringContainsVowels {
    public static void main(String[] args) {
        String str = " you have a good day";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                System.out.println("String contains vowel " + str.charAt(i) + " At the index " + i);


            }
        }
    }
}
