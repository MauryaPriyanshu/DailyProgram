package Annotation;

class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Textmessage sent!");
    }
}
class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via whatsApp!");
    }
}
public class OverrideAnnotation {
    public static void main(String[]  args){
        @SuppressWarnings("deprecation")
        AndroidPhone sumsung =  new AndroidPhone();
        sumsung.sendMessage();
    }
}
