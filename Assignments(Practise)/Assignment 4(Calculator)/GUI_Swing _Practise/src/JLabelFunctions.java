import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelFunctions {
    public static void main(String[] args) {
        //BoredrFactory.createLineBoe=rder(Color,thcicknes) is used to make the border
        Border border= BorderFactory.createLineBorder(Color.gray,3);

        ImageIcon image=new ImageIcon("D:\\3rd Semester\\OOP Practise Work\\GUI_Swing _Practise\\src\\Logo.png");
        JLabel label=new JLabel(); // it is used to make a label in frame
        label.setText("Muzzammil Can u Code ");

        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);  //set position left right center to image horizontally
        label.setVerticalTextPosition(JLabel.TOP);//set position left right center to image Vertically

        label.setHorizontalAlignment(JLabel.CENTER); //TO set the position of both image with text of label horizontaly acc to frame
        label.setVerticalAlignment(JLabel.CENTER); //TO set the position of both image with text of label Vertically acc to frame

//      label.setForeground(new Color(9,5,5));

        label.setForeground(Color.GREEN);  //set the font color to your choice color

        label.setFont(new Font("Arial",Font.ITALIC,23)); //it is used to set the font size type and bold etc

        label.setIconTextGap(25);  //used to set the imag icon and text gap

        label.setBackground(Color.BLACK); //if we are changing background using this we must also call lablel.Opaque(true);
        label.setOpaque(true);//it must be called with label.Background() to change background

        label.setBorder(border);


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setResizable(true);
//        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        frame.pack();


    }
}
