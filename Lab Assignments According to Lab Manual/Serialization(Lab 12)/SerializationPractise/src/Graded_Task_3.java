import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Graded_Task_3 {
    public static void main(String[] args) {
        Book b1 = SearchObject("Mr chips_3");
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPublisher());

    }

    public static Book SearchObject(String bookName) {
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("BookStore.ser"));
            boolean b1 = true;
            while (b1) {
                try{
                    Book b = (Book) oin.readObject();
                    if (b.getName().equalsIgnoreCase(bookName)) {
                        b1 = false;
                        return b;
                    }
                }catch(EOFException e){
                    System.out.println("Book Not found");
                    break;
                }
            }
            oin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
