package dailyProgram;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {2,6,9,4,7,3};
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("print the reverse of the array:");
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
