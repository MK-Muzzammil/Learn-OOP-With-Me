import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionalButtons = new JButton[12];

    JButton addButton, subButton, mulButton, divButton;
    JButton decimalButton, equalButton, delButton, clrButton;
    JButton sinButton, cosButton, tanButton, powerButton;

    JPanel panel;

    Font f = new Font("Times New Roman", Font.BOLD, 25);
    double num1 = 0;
    double num2 = 0;
    double result = 0;

    String operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(25, 40, 390, 65);
        textField.setFont(f);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        delButton = new JButton("del");
        clrButton = new JButton("Clear");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        powerButton = new JButton("pow");

        functionalButtons[0] = addButton;
        functionalButtons[1] = subButton;
        functionalButtons[2] = mulButton;
        functionalButtons[3] = divButton;
        functionalButtons[4] = delButton;
        functionalButtons[5] = equalButton;
        functionalButtons[6] = decimalButton;
        functionalButtons[7] = clrButton;
        functionalButtons[8] = sinButton;
        functionalButtons[9] = cosButton;
        functionalButtons[10] = tanButton;
        functionalButtons[11] = powerButton;

        for (int i = 0; i < 12; i++) {
            functionalButtons[i].addActionListener(this);
            functionalButtons[i].setFont(f);
            functionalButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(f);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 135, 50);
        clrButton.setBounds(200, 430, 135, 50);

        panel = new JPanel();
        panel.setBounds(10, 120, 410, 300);
        panel.setLayout(new GridLayout(4, 5, 5, 5));
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(powerButton);
        panel.add(decimalButton);

        panel.add(numberButtons[9]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[7]);
        panel.add(mulButton);
        panel.add(addButton);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[4]);
        panel.add(divButton);
        panel.add(subButton);
        panel.add(numberButtons[3]);

        panel.add(numberButtons[2]);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.setBackground(Color.WHITE);
        frame.add(textField);
        frame.add(delButton);
        frame.add(clrButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decimalButton) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }
        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    try {
                        result = num1 / num2;
                    } catch (Exception ex) {
                        textField.setText("Math Error");
                        break;
                    }
            }
            if (!(operator == "/" && num2 != 0)) {
                textField.setText(String.valueOf(result));
                num1 = result;
            }
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == delButton) {
            String string = textField.getText();
            if (string.length() > 0) {
                string = string.substring(0, string.length() - 1);
                textField.setText(string);
            }
        }
        if (e.getSource() == sinButton) {
            double value = Double.parseDouble(textField.getText());
            double sinValue = Math.sin(Math.toRadians(value));
            textField.setText(String.valueOf(sinValue));
        }
        if (e.getSource() == cosButton) {
            double value = Double.parseDouble(textField.getText());
            double cosValue = Math.cos(Math.toRadians(value));
            textField.setText(String.valueOf(cosValue));
        }
        if (e.getSource() == tanButton) {
            double value = Double.parseDouble(textField.getText());
            double tanValue = Math.tan(Math.toRadians(value));
            textField.setText(String.valueOf(tanValue));
        }
        if (e.getSource() == powerButton) {
            double value = Double.parseDouble(textField.getText());
            double powerValue = Math.pow(value, 2);
            textField.setText(String.valueOf(powerValue));
        }
    }
}
