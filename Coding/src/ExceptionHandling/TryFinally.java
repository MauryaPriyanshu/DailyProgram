package ExceptionHandling;

public class TryFinally {
    public static void main(String[] args){
        try{
            int result = 36/0;
        }
        finally {
            int result = 36 / 6;
            System.out.println("Finally block result:" + result);
        }
    }
}
