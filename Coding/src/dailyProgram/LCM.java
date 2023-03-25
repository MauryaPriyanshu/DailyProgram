package dailyProgram;

public class LCM {
    public static void main(String[] args){
        int n1 = 54, n2 = 90;
        int lcm = 0;
        int max = (n1 > n2)? n1 : n2;
        for(int i = max; i <= n1*n2; i++){
            if(i%n1 == 0 && i%n2 == 0) {
                lcm = i;
                break;
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("The lcm : " + lcm);
    }
}
