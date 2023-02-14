package dailyProgram;

public class LeapYear {
    public static void main(String[] args){
        int year = 2023;
        if(year%4 == 0){
            System.out.println("Year is leap year!");
        } else if (year%400 == 0 && year%100 == 0) {
            System.out.println("year is leap Year!");

        }
        else{
            System.out.println("Year is not leap year!");
        }
    }
}
