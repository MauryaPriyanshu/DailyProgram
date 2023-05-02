package dailyProgram;

import java.sql.SQLOutput;

public class RemoveElement {
    public static void main(String[] arsg){
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println("After removing the element:" + removeElement(arr, val));
    }
    public static int removeElement(int[] arr, int val){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            if(arr[end] == val){
                end--;
            }
            else if(arr[start] == val){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
            else{
                start++;
            }
        }
        return end+1;
    }
}
