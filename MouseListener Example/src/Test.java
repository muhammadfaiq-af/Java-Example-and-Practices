
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
class GUI implements MouseListener
{
    JFrame frame;
    JButton click, enter, exit, press, release;
    
    public GUI()
    {
        frame = new JFrame ();
        click = new JButton ("Click");
        enter = new JButton ("Enter");
        exit = new JButton ("Exit");
        press = new JButton ("Press");
        release = new JButton ("Release");
        frame.setLayout(new FlowLayout());
        frame.add(click); frame.add(press); frame.add(release); frame.add(enter);
        frame.add(exit);
        frame.setVisible(true); frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        click.addMouseListener(this);
        press.addMouseListener(this);
        release.addMouseListener(this);
        enter.addMouseListener(this);
        exit.addMouseListener(this);

    }
    

    
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == click)
                JOptionPane.showMessageDialog(null, "You have clicked the button");
    }

    public void mousePressed(MouseEvent me) {
    if (me.getSource() == press)    
        JOptionPane.showMessageDialog(null, "You have pressed the button");

    }

    public void mouseReleased(MouseEvent me) {
    if (me.getSource() == release)
        JOptionPane.showMessageDialog(null, "You have released the button");

    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == enter)
     JOptionPane.showMessageDialog(null, "You have entered into the dimension of button");   
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == exit)
        JOptionPane.showMessageDialog(null, "You have exited the dimension of button");
    }
    
}
public class Test {

    
    public static void main(String[] args) 
    {
    new GUI();    
    }
    
}
