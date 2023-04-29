package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args){

        //Code to create new File
/*
        File myFile = new File("FHexample.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }


        //code to write to a file
        try {
            FileWriter myFileWriter = new FileWriter("FHexample.txt");
            myFileWriter.write("This is our first file for file handling\n Okay!!");
            myFileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
    }


//        Reading a file
        File myFile = new File("FHexample.txt");
        try{
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
            sc.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }

 */
        File myFile = new File("FHexample.txt");
        if(myFile.delete()){
            System.out.println("I have deleted" + myFile.getName());
        }
        else{
            System.out.println("Some error accor by deleting the file");
        }


    }
}
