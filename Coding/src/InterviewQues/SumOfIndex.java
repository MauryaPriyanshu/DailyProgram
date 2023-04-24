package InterviewQues;

public class SumOfIndex {
    public static void main(String[] args) {
        int[] arr = {2,7,9,4,6,3,1,8,12};
        int target = 10;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count = i+j;
                }
            }
        }
        System.out.println("The sum of the index is : " + count);
    }
}
