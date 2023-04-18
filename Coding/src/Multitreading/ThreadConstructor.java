package Multitreading;

class My_Thread extends Thread{
    public My_Thread(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
    }
}

public class ThreadConstructor {
    public static void main(String[] args){
        My_Thread t1 = new My_Thread("Priyanshu Maurya");
        My_Thread t2 = new My_Thread("Goddan");
        t1.start();
        t2.start();
        System.out.println("Print the id of the thread t is :" + t1.getId());
        System.out.println("Print the name of the thread t is :" + t1.getName());
        System.out.println("Print the id of the thread t is :" + t2.getId());
        System.out.println("Print the name of the thread t is :" + t2.getName());

    }
}
