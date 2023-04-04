package Multitreading;

public class TestMultitasking  extends Thread{
    public void run(){
        System.out.println("task One");
    }
    public static void main(String[] args){
        TestMultitasking t1 = new TestMultitasking();
        TestMultitasking t2 = new TestMultitasking();

        t1.start();
        t2.start();
    }
}
