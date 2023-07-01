import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
//main reason to do this we can simply make o=instance(object) in main class so all these functionlities come and it cleans our code
public class MyFrame extends JFrame {  //myFrame is child class and JFrame is parent class
    public MyFrame(){
        //frame.setSize(x,y)  is used to set the lengt and width of frame
        this.setSize(200,200);

        //frame.setTile() is used to set the title of the frame
        this.setTitle("Muzzammil Frame");

        //frame.setDefaultCloseOperation(Jframe.Exit_ON_ClOSE) is used to exit when we press close button
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); is used if we would not want to exit even if we press close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //frame.setResizeable(bool) is used to prevent our Frame to be reizeable
        this.setResizable(false);//dont want to resize the Frame

        //let see we want to change logo of java that is default so we can replace it with
        //import javax.swing.ImageIcon which can set our logo
        ImageIcon image=new ImageIcon("D:\\3rd Semester\\OOP Practise Work\\GUI_Swing _Practise\\src\\Logo.png");  //making new object give me path were image is downloaded
        this.setIconImage(image.getImage());  //is used to set the IconImage to frame

        //If we want to change the background of frame for this frame.getContentPane().setBackground(new Color(Hexadecimal Values or int values))
        this.getContentPane().setBackground(new Color(125,121,56));
        this.getContentPane().setBackground(new Color(1221234212));

        //if we want to change background by specific color given we use swt Package
        this.getContentPane().setBackground(Color.CYAN);  //diferent colors can be sent
        //frame.setVisible() is used to make frame visible
        this.setVisible(true);
    }


}
