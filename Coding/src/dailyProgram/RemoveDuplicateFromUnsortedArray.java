package dailyProgram;

import java.util.HashMap;

public class RemoveDuplicateFromUnsortedArray {
    public static void main(String[] args){
        int[] arr = {10,20,10,30,50,40};
        System.out.println("After removing the duplicate from the unsorted arraY");
        RemoveDupli(arr);
    }

    public static void RemoveDupli(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; ++i){
            if(hm.containsKey(arr[i])){
                hm.remove(arr[i]);
            }
            hm.put(arr[i],i);
        }

        hm.forEach((k,v) -> System.out.print(k + " "));
    }
}
