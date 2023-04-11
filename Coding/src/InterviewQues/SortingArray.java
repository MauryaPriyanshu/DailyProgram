package InterviewQues;

public class SortingArray {
    public static void main(String[] args){
        int[] arr = {90,65,10,34,78,56};
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("After Sorting the element of the array are: ");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
