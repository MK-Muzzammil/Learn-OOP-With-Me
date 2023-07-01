import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

class Book implements Serializable {
    private String name;
    private String publisher;
    private String author;

    public Book(){

    }
    public Book(String name, String publisher, String author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}



//public class GradedTask_1 {
//    public static void main(String[] args) {
//        try{
//            ArrayList<Book> b=new ArrayList<>(5);
//            Book b1=new Book("Mr chips_1","XYZ","Abc");
//            Book b2=new Book("Mr chips_2","XYZ","Abc");
//            Book b3=new Book("Mr chips_3","XYZ","Abc");
//            Book b4=new Book("Mr chips_4","XYZ","Abc");
//            Book b5=new Book("Mr chips_5","XYZ","Abc");
//            b.add(b1);
//            b.add(b2);
//            b.add(b3);
//            b.add(b4);
//            b.add(b5);
//
//            FileOutputStream fos=new FileOutputStream("BookStore.txt",true);
//            ObjectOutputStream os=new ObjectOutputStream(fos);
//            int i=0;
//            while(i<b.size()){
//                os.writeObject(b.get(i));
//                i++;
//            }
//            fos.close();
//            os.close();
//
//
//        }
//        catch(Exception ex){
//            ex.printStackTrace();
//        }
//    }
//}
public class GradedTask_1 {
    public static void main(String[] args) {
        try {
            Book b1 = new Book("Mr chips_1", "XYZ", "Abc");
            Book b2 = new Book("Mr chips_2", "XYZ", "Abc");
            Book b3 = new Book("Mr chips_3", "XYZ", "Abc");
            Book b4 = new Book("Mr chips_4", "XYZ", "Abc");
            Book b5 = new Book("Mr chips_5", "XYZ", "Abc");

            FileOutputStream fos = new FileOutputStream("BookStore.ser", false);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(b1);
            os.writeObject(b2);
            os.writeObject(b3);
            os.writeObject(b4);
            os.writeObject(b5);

            fos.close();
            os.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
