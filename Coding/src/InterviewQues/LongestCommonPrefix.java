package InterviewQues;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str = {"clove", "clap", "clone","cier"};
        StringBuilder result = new StringBuilder();

        Arrays.sort(str);

        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
            
        }
        System.out.println("longest common prefix:" + result.toString());

    }
}
