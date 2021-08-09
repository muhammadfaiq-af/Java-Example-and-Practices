import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
class GUI extends MouseAdapter
{
    JFrame frame;
    JButton ok, exit;
    
    public GUI()
    {
        frame = new JFrame();
        ok = new JButton ("OK");
        exit = new JButton ("Exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok); frame.add(exit);
        
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ok.addMouseListener(this);
        exit.addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent me)
    {
        if (me.getSource() == ok)
            JOptionPane.showMessageDialog(null, "OKAY BUTTON WAS CLICKED");
        if (me.getSource() == exit)
            System.exit(0);
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
