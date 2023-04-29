package InterviewQues;

public class ReverseString {
    public static void main(String[] args) {
        String str = "priyanshu is a good girl";
        char[] arr = str.toCharArray();
        char temp = 0;
// 1)       String rev = " ";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);
//    }



        for(int i = 0; i <= arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("print the reverse String is:");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

    }
}
