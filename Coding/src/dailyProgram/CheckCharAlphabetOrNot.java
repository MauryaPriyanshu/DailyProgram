package dailyProgram;

public class CheckCharAlphabetOrNot {
    public static void main(String[] args){
        char ch;
        ch = 'I';
        if((ch >= 65 && ch <= 90)||(ch >= 97 && ch <= 122)){
            System.out.println("the inseted character " + ch +" is an alphbet");
        }
        else{
            System.out.println("the inseted character " + ch +" is not an alphbet");
        }
    }
}
