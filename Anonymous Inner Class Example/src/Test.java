import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

class GUI
{
    JFrame frame;
    JButton ok, exit;
    JLabel label;
    int x, y;
    
    public GUI()
    {
        frame = new JFrame();
        ok = new JButton ("OK");
        exit = new JButton("Exit");
        label = new JLabel("Move the mouse on the frame");
        
        
        frame.setLayout(new FlowLayout());
        frame.add(ok); frame.add(exit); frame.add(label);
        
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseMotionListener(new MouseMotionAdapter()
        {
        public void mouseMoved(MouseEvent me)
        {
            x = me.getX();
            y = me.getY();
            
            label.setText(x + " , " + y);
        }
        });
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent we) {
                JOptionPane.showMessageDialog(null, "Welcome");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                JOptionPane.showMessageDialog(null, "Good Bye");
            }
        
        });
        
        ok.addMouseListener(new MouseAdapter()
        {
            
            public void mouseClicked(MouseEvent me) {
                JOptionPane.showMessageDialog(null, "Ok button was clicked");
           }
        
        });
        exit.addMouseListener(new MouseAdapter()
        {
            
            public void mouseClicked(MouseEvent me) {
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
        // TODO code application logic here
        new GUI();
    }
    
}
