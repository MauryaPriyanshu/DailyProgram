package Multitreading;

//java thread example by implementing runnable interface
class TestMultitasking1 implements Runnable{
    public void run(){
        System.out.println("task two");
    }
    public static void main(String[] args){
        Thread t1 = new Thread(new TestMultitasking1());
        Thread t2 = new Thread(new TestMultitasking1());

        t1.start();
        t2.start();
    }

}
