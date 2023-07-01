import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JPannelFunctions {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("D:\\3rd Semester\\OOP Practise Work\\GUI_Swing _Practise\\src\\Logo.png");
//
//        JLabel  label=new JLabel("Hello How are you!");
//        label.setFont(new Font("Arial",Font.BOLD,20));
//        label.setForeground(Color.BLACK);
//        label.setOpaque(true);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setIcon(image);
//
//        label.setBounds(0,0,100,100);


        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);  //pannel .background is used to set the background color to it
        //set Bound is used to set x and y axis position with its size meand width and height
        redPanel.setBounds(0,0,200,200);
        JPanel blackPanel=new JPanel();
        blackPanel.setBackground(new Color(1,2,3));
        blackPanel.setBounds(200,0,200,200);

        JPanel grayPanel=new JPanel();
        grayPanel.setBackground(Color.gray);  //pannel .background is used to set the background color to it
        //set Bound is used to set x and y axis position with its size meand width and height
        grayPanel.setBounds(400,0,100,200);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);  //pannel .background is used to set the background color to it
        //set Bound is used to set x and y axis position with its size meand width and height
        greenPanel.setBounds(0,200,500,200);

        //add() func is used to add any compoent to pannel like label
//        greenPanel.add(label);

//        greenPanel.setLayout(new BorderLayout());


        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setResizable(true);

        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(redPanel);
        frame.add(blackPanel);

//        greenPanel.add(label);
        frame.add(greenPanel);
    }
}
