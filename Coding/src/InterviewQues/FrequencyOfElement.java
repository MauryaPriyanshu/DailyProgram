package InterviewQues;

public class FrequencyOfElement {
    public static void main(String[] args){
        int[] arr = {2,4,6,2,2,4,6};
        int[] new_arr = new int[arr.length];
        int visited = -1;

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            if(arr[i] != visited)
            {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = visited;
                }
            }

                 new_arr[i] = count;
            }
        }
        for(int i = 0; i < new_arr.length; i++){
            if(arr[i] != visited)
            System.out.println("Frequency of " +arr[i] + "|" + new_arr[i]);
        }
    }
}
