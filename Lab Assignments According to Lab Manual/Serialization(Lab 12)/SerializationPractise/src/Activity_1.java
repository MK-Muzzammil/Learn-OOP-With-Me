import java.io.*;
class Person implements Serializable
{
    public String name = null;
    public int age = 0;
    public void setAge(int a) { age = a ;}
    public String getName() {return name ;}
}
//---------------------------------------------------------------------
public class Activity_1 {
    public static void main(String[] args) {
        writeToFile();
    }
    public static void writeToFile() {
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("filename.txt"));

            Person p = new Person();
            p.name = "Jakob Jenkov";
            p.age = 40;
            Person p1=new Person();
            p1.age=45;
            p1.name="Muzzammil";

            objectOutputStream.writeObject(p);
            objectOutputStream.writeObject(p1);
        }
        catch (FileNotFoundException ex) { ex.printStackTrace();
        }

        catch (IOException ex) { ex.printStackTrace();
        }
    }
}


