import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame implements ActionListener {
    Container c;
    JLabel label1,label2;
    JTextField usernamefield,passwordField;
    JPasswordField pass;
    JButton loginButton;
    public MyFrame1(){
        JFrame frame=new JFrame();
        frame.setTitle("Login Form");
        frame.setSize(400,400);
        frame.setLocation(50,60);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        c=getContentPane();
        c.setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernamefield = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        c.add(loginButton);
        loginButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));


        panel.add(usernameLabel);
        panel.add(usernamefield);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        frame.add(panel);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        System.out.println("USername "+usernamefield.getText() +" Password "+passwordField.getText() );
    }


}





public class LoginForm {
    public static void main(String[] args) {
        MyFrame1 frame=new MyFrame1();

    }
}
