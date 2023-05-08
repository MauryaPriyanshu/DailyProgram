package dailyProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NonRepeatingFirstElement {
    public static void main(String[] args){
        System.out.println("Enter the Element of array :");

        int[] arr = {-1,3,-1,0,3};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
        System.out.println("First non repeating element is :");
        System.out.println(nonRepeatingFirstElement(arr));

    }
    public static int nonRepeatingFirstElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int j;
            for(j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j])
                    break;}
                if(j == arr.length)
                    return arr[i];
            }

        return -1;
    }
}
