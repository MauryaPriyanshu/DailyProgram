package InterviewQues;

public class FrequencyOfElement {
    public static void main(String[] args){
        int[] arr = {2,4,6,2,2,4,6};
        int count = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j <= arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println("Frequency of " +arr[i] + count);
        }
    }
}
