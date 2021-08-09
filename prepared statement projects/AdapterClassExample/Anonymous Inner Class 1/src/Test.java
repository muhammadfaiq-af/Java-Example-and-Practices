import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class GUI
{
    JFrame frame;
    JButton ok,exit;
    
    public GUI()
    {
        frame = new JFrame ();
        ok = new JButton("OK");
        exit = new JButton("Exit");
        
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ok.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
        JOptionPane.showMessageDialog(null, "You have clicked the OK button");
        }
        });
        exit.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
        System.exit(0);
        }
        });
    }
}
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    new GUI();
// TODO code application logic here
    }
    
}
