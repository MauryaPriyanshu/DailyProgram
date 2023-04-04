package InterviewQues;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Priyanshu");
        list.add("aba");
        list.add("Shivangi");

       // list.add(32); compile time error
        String s = list.get(2);
        System.out.println("element is :" + s);

//        Iterator<String> itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        System.out.println(list.get(2));

    }
}
