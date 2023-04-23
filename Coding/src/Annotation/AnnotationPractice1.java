package Annotation;

public class AnnotationPractice1 {
    public static void main(String args[]){
        AndroidPhone1 Samsung = new AndroidPhone1();
        Samsung.sendMessage();
    }
}
    class KeyPadPhone1{
        @Deprecated
        void sendMessage(){
            System.out.println("Text message sent!");
        }
    }

    class AndroidPhone1 extends KeyPadPhone{
        @Override
        void sendMessage(){
            System.out.println("Message sent via WhatsApp!");
        }
    }

