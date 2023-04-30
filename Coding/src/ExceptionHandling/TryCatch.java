package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args){
        try{
            int result = 36/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
