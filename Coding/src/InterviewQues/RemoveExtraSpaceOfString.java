package InterviewQues;

import java.util.Arrays;

//How do you remove leading and trailing spaces from a string in Java?
public class RemoveExtraSpaceOfString {
    public static void main(String[] args){
        String sen = "  Life is good  ";
//
        System.out.println(sen.trim());
        sen = sen.replaceAll("\\ "," ");
        System.out.println(sen);
        String[] str = sen.split(" ");
        String reverse = "";
        for(int i = 0; i < str.length; i++){
            if(i == str.length-1){
                reverse = str[i] + reverse;
            }
            else{
                reverse = " " + str[i] + reverse;
            }
        }
        System.out.println("After Reverse of the sentence and removing whitespace : "+reverse.replaceAll("//s",""));
    }
}
