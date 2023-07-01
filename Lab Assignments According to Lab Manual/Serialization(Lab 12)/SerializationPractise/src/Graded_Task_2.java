import javax.management.ObjectName;
import java.io.*;
import java.util.ArrayList;

public class Graded_Task_2 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("BookStore.ser");
            ObjectInputStream oin=new ObjectInputStream(fin);
            while(true){
                try{
                    Book bin=(Book)oin.readObject();
                    System.out.println( bin.getName());
                    System.out.println( bin.getAuthor());
                    System.out.println( bin.getPublisher());
                    System.out.println("======================================================");
                }
                catch(EOFException e){
                    break;
                }
            }
            fin.close();
            oin.close();
        }
        catch(Exception ex){
         ex.printStackTrace();
        }
    }
}
