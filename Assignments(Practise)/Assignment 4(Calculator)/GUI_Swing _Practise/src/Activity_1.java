import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;




class CustomeFrame extends JFrame{

    JFrame f;
    JTextField textField,textField1,getTextField2;
    JLabel label,label1,label2;
    JButton button1,button2;
    public CustomeFrame(){
        f=new JFrame("Show Flow Layout");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(2,3));

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();
        JPanel panel6=new JPanel();
        JPanel panel7=new JPanel();
        JPanel panel8=new JPanel();
        JPanel panel9=new JPanel();
        JPanel panel10=new JPanel();

        panel5.setLayout(new GridLayout(2,2,3,4));
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));


        panel1.setBackground(Color.GRAY);
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.RED);
        panel6.setBackground(Color.BLUE);
        panel7.setBackground(Color.WHITE);
        panel8.setBackground(Color.GREEN);
        panel9.setBackground(Color.GREEN);
        panel10.setBackground(Color.GREEN);

        panel5.add(panel6,BorderLayout.EAST);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.SOUTH);
        panel5.add(panel9,BorderLayout.NORTH);
        panel5.add(panel10,BorderLayout.CENTER);

        f.add(panel5,BorderLayout.CENTER);
        f.add(panel1,BorderLayout.NORTH);
        f.add(panel2,BorderLayout.SOUTH);
        f.add(panel3,BorderLayout.WEST);
        f.add(panel4,BorderLayout.EAST);



        f.setVisible(true);
    }


}


public class Activity_1 {
    public static void main(String[] args) {
        CustomeFrame f=new CustomeFrame();
    }
}
