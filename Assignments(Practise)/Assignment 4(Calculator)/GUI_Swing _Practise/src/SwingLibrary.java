import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;  //for seting the background color

public class SwingLibrary {
    public static void main(String[] args) {
        //it is used to make a new frame
//        JFrame frame=new JFrame();

//        //frame.setSize(x,y)  is used to set the lengt and width of frame
//        frame.setSize(800,1000);
//
//        //frame.setTile() is used to set the title of the frame
//        frame.setTitle("Muzzammil Frame");
//
//        //frame.setDefaultCloseOperation(Jframe.Exit_ON_ClOSE) is used to exit when we press close button
//        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); is used if we would not want to exit even if we press close button
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//
//        //frame.setResizeable(bool) is used to prevent our Frame to be reizeable
//        frame.setResizable(false);//dont want to resize the Frame
//
//        //let see we want to change logo of java that is default so we can replace it with
//        //import javax.swing.ImageIcon which can set our logo
//        ImageIcon image=new ImageIcon("D:\\3rd Semester\\OOP Practise Work\\GUI_Swing _Practise\\src\\Logo.png");  //making new object give me path were image is downloaded
//        frame.setIconImage(image.getImage());  //is used to set the IconImage to frame
//
//        //If we want to change the background of frame for this frame.getContentPane().setBackground(new Color(Hexadecimal Values or int values))
//        frame.getContentPane().setBackground(new Color(125,121,56));
//        frame.getContentPane().setBackground(new Color(1221234212));
//
//        //if we want to change background by specific color given we use swt Package
//        frame.getContentPane().setBackground(Color.CYAN);  //diferent colors can be sent
//        //frame.setVisible() is used to make frame visible
//        frame.setVisible(true);


        //This is basically child class made by me in new file and i make object in this file
        //so all the function is appliewd
        MyFrame frame=new MyFrame();

    }

}
