package Multitreading;

public class TestCallRun extends Thread{
    public void run(){
        System.out.println("running....to test call run");
    }
    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun();
//        fine, but does not start a seprate call stack
        t1.run();
    }
}
