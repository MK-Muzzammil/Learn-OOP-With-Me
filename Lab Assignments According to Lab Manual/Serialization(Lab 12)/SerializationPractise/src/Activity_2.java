import java.io.*;
public class Activity_2 {
    public static void main(String[] args) {
        readFromFile();
    }
    public static void readFromFile()
    {
        try
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(new
                    FileInputStream("filename.txt"));
            while (true)
            {
                Person personRead = (Person) objectInputStream.readObject();
                System.out.println(personRead.name);
                System.out.println(personRead.age);
            }
        }
        catch (EOFException ex) { //This exception will be caught when EOF is
             System.out.println("End of file reached.");


        }
        catch (ClassNotFoundException ex) { ex.printStackTrace();
        }
        catch (FileNotFoundException ex) { ex.printStackTrace();
        }
        catch (IOException ex) { ex.printStackTrace();}
    }
}

