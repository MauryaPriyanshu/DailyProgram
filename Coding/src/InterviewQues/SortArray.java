package InterviewQues;

public class SortArray {
    public static void main(String [] args){
        int[] arr = {5,2,1,9,4,7,6};
        int temp;
        for(int i = 0; i < arr.length -1; i++){
            for(int j  = 0; j < arr.length/2; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j = arr.length/2; j < arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
