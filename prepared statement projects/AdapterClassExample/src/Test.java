import javax.swing.*;
import java.awt.event.*;

class GUI extends WindowAdapter
{
JFrame frame;
public GUI()
{
    frame = new JFrame ();
    frame.setVisible(true);
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addWindowListener(this);
}
public void windowOpened(WindowEvent we)
{
    JOptionPane.showMessageDialog(frame, "Welcome");
}
public void windowClosing(WindowEvent we)
{
    JOptionPane.showMessageDialog(frame, "Good Bye");
}
}
public class Test {
    public static void main(String[] args) 
    {
    new GUI();    
    }
    
}
