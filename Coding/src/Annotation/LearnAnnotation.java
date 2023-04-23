package Annotation;

class Phone{
    public static void msg(){
        System.out.println("Phon have feature of message!");
    }
}
class NewPhone extends Phone{
    public static void msg(){
        System.out.println("new phone also have msg feature");
    }

}
public class LearnAnnotation {
    public static void main(String[] args){
      Phone phone = new NewPhone();
//      Phone Nphone = new NewPhone();
      phone.msg();
//      Nphone.msg();
    }
}
