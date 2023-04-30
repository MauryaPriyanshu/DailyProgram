package ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args){
        try{
            int result = 36/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }
        finally{
            int result = 36/6;
            System.out.println("finally block result:" + result);
        }
    }
}
