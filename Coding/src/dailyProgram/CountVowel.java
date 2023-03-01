package dailyProgram;

public class CountVowel {
    public static void main(String[] args){
        String str = "Priyanshu";
        char[] arr = str.toCharArray();
        int vowels = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;

            }
        }
        System.out.println("Number of vowels :" + vowels);

    }
}
