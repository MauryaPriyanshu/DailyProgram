package dailyProgram;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        int sum = 0;
        int totalSum = (arr.length) * (arr.length+1)/2;
        for(int i = 0; i < arr.length-1; i++){
            sum = sum + arr[i];
        }
        int missingNum = totalSum-sum;
        System.out.println("Missing number is :" + missingNum);
    }
}
