import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

class GUI
{
    JFrame frame;
    JButton ok,exit;
    
    public GUI()
    {
        frame = new JFrame ();
        ok = new JButton ("OK");
        exit = new JButton ("EXIT");
        
        frame.setLayout(new FlowLayout());
        frame.add(ok); frame.add(exit);
        
        frame.setVisible(true); frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ok.addMouseListener(new MouseHandler());
        exit.addMouseListener(new MouseHandler());
        frame.addWindowListener(new WindowHandler());
    }
    
    private class WindowHandler extends WindowAdapter
    {
    public void windowOpened(WindowEvent we) {
        JOptionPane.showMessageDialog(null, "Welcome");
    }
    public void windowClosing(WindowEvent we) {
        JOptionPane.showMessageDialog(null, "Good Bye");
    } 
    
    }
    private class MouseHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me) {
        
        if (me.getSource() == ok)
            JOptionPane.showMessageDialog(null, "Ok Button was clicked");
        if (me.getSource() == exit)
            System.exit(0);
    }
    }
    
}
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GUI();
    }
    
}
