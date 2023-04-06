package Multitreading;

public class ThreadRunnableString implements Runnable  {
    public void run(){
        System.out.println("Now the thread is running...");
    }
    public static void main(String[] args){
        Runnable r1 = new ThreadRunnableString();

        Thread th1 = new Thread(r1, " My  new Thread");

        th1.run();
        String str = th1.getName();
       System.out.println(str);
    }
}
