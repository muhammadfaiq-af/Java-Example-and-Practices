import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI extends MouseAdapter
{
JFrame frame;
JButton ok,exit;

public GUI()
{
    frame = new JFrame();
    ok = new JButton("OK");
    exit = new JButton ("Exit");
    frame.setLayout(new FlowLayout());
    frame.add(ok);frame.add(exit);
    frame.setVisible(true); frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ok.addMouseListener(this);
    exit.addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
if (me.getSource() == ok)
    JOptionPane.showMessageDialog(frame,"OK button was clicked");
else if (me.getSource() == exit)
{
    int option = JOptionPane.showConfirmDialog(frame, "Do you really want to exit?","Exit Application",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (option == 0)
        System.exit(0);
}
}
}
public class Test 
{
public static void main(String[] args) 
{
 new GUI();       
}  
}
