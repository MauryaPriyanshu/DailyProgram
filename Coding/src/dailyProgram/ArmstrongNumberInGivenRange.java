package dailyProgram;

import static dailyProgram.ArmstrongNumber.order;

public class ArmstrongNumberInGivenRange {
    public static void main(String[] args) {
        int low = 1;
        int high = 1000;

        System.out.println("Print the armstrong number in the range of " + low + " to" + high);
        for (int i = low; i <= high; i++) {
            int count = order(i);
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + (int) Math.pow(rem, count);
                temp = temp / 10;

            }
            if (i == sum) {
                System.out.print(i + " ,");
            }
        }
    }
        public static int order(int i){
            int count = 0;
            while(i > 0){
                i = i/10;
                count++;
            }
            return count;
        }

}
