package Multitreading;


class Practice extends Thread {
    public void run() {
//        while (true) {
            System.out.println("Good Morning!");
//        }
    }
}
    class Practice1 extends Thread{
    public void run(){
//        while(false){
//            try{
//                Thread.sleep(200);
//
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//            System.out.println("welcome");
//    }
  }
}
public class ThreadPractice3 {
    public static void main(String[] args){
        Practice p1 = new Practice();
        Practice1 p2 = new Practice1();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
