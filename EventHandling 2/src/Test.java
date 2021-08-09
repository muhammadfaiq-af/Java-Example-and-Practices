import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;

class GUI implements ActionListener{
    int num1, num2, answer;
    String number;
    JFrame frame;
    JButton plus, multiply;
    JLabel lblFirst, lblSecond, lblAnswer;
    JTextField txtFirst, txtSecond,txtAnswer;
    public void actionPerformed(ActionEvent ae)
    {
     if (ae.getSource() == plus)
     {
         number = txtFirst.getText();
         num1 = Integer.parseInt(number);
         number = txtSecond.getText();
         num2 = Integer.parseInt(number);
         
         answer = num1 + num2;
         
         txtAnswer.setText(answer + "");
     }
     if (ae.getSource() == multiply)
     {
         number = txtFirst.getText();
         num1 = Integer.parseInt(number);
         number = txtSecond.getText();
         num2 = Integer.parseInt(number);
         answer = num1 * num2;
         txtAnswer.setText(answer + "");
     }
    }
    public GUI()
    {
        frame = new JFrame();
        plus = new JButton ("+");
        multiply = new JButton ("*");
        lblFirst = new JLabel ("First Operand");
        lblSecond = new JLabel ("Second Operand");
        lblAnswer = new JLabel ("Answer");
        txtFirst =  new JTextField(10);
        txtSecond =  new JTextField(10);
        txtAnswer =  new JTextField(10);
        frame.setLayout(new FlowLayout());
        frame.add(lblFirst); frame.add(txtFirst);
        frame.add(lblSecond);frame.add(txtSecond);
        frame.add(plus); frame.add(multiply);
        frame.add(lblAnswer);frame.add(txtAnswer);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150,200);
        plus.addActionListener(this);
        multiply.addActionListener(this);
        
        
        
    }
}

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        new GUI();
    }
    
}
