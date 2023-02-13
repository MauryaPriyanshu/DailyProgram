package dailyProgram;

public class BasicProgram {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("value of a is: "+a + " " +" value of b is "+ b);
    }
}
