package dailyProgram;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 50, 50,60,80};
        int n = arr.length;
        n = removeDuplicateElements(arr,n);
        System.out.println("***********After removing the duplicate element from the array*********");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }


        public static int removeDuplicateElements(int[] arr, int n){
        if(n == 0||n ==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for(int i =0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for(int i = 0; i < j; i++){
            arr[i] = temp[i];
        }
        return j;
    }


}
