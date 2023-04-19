package Multitreading;

public class ThreadPractice extends Thread{
    public void run(){
        while(true) {
            System.out.println("Good Morning");
            System.out.println("Welcome");
        }
    }
    public static void main(String[] args){
        ThreadPractice t1 = new ThreadPractice();
        ThreadPractice t2 = new ThreadPractice();
        t1.start();
        t2.start();

    }
}
