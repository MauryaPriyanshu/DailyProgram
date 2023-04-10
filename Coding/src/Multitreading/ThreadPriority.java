package Multitreading;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 34;
//        while(true){
        System.out.println("Thank you!!" + this.getName());
//        }
    }
}
public class ThreadPriority {
    public static void main(String[] arrgs){
       MyThread t1 = new MyThread("Priyanshu");
       MyThread t2 = new MyThread("Guddan");
       MyThread t3 = new MyThread("Shivangi");
       MyThread t4 = new MyThread("Vandana(imp)");
       t4.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
}
