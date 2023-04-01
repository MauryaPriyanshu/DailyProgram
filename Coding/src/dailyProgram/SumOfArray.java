package dailyProgram;

//Find the sum of the element of the given Array

public class SumOfArray {
    public static void main(String[] args){
        int[] arr = {2,8,3,5,9,1};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements of the array is : " +sum);
    }
}
