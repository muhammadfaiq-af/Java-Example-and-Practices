import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
class GUI implements ActionListener
{
    JFrame frame;
    JButton ok,exit;
    
    public GUI()
    {
        frame = new JFrame ();
        ok = new JButton ("OK");
        exit = new JButton("Exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ok.addActionListener(this);   
        exit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
    if (ae.getSource() == ok)    
        JOptionPane.showMessageDialog(null,"You have clicked the OK button");
    if (ae.getSource() == exit)
    {
        int choice = JOptionPane.showConfirmDialog(null, "Do you really want to exit", "Exit Application",JOptionPane.YES_NO_OPTION);
        if (choice == 0)
                System.exit(0);
    }
    }
}
public class Test {

   
    public static void main(String[] args) {
    new GUI();
    
    }
    
}
