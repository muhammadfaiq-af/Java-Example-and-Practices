import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI extends MouseAdapter implements ActionListener
{
    JFrame frame;
    JButton button;
    Container con ;
    
public GUI()
{
  frame = new JFrame ();
  button = new JButton ("Set Red Color");
  con = frame.getContentPane();
  frame.setLayout(new FlowLayout());
  frame.add(button);
  frame.setVisible(true); frame.setSize(400,300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  con.setBackground(Color.BLACK);
  button.addActionListener(this);
  frame.addMouseListener(this);
  frame.addWindowListener(new WindowHandler());
  frame.addMouseMotionListener(new MouseMotionHandler());
  
}
public void actionPerformed(ActionEvent ae) {
        if (button.getText().equals("Set Red Color"))
        {
            con.setBackground(Color.red);
            button.setText("Set Black Color");
        }
        else
        {
            con.setBackground(Color.BLACK);
            button.setText("Set Red Color");
        }
        }
public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse was clicked on the frame");
    }

private class WindowHandler extends WindowAdapter
{
public void windowOpened(WindowEvent we) {
        JOptionPane.showMessageDialog(frame, "Welcome");
    }
public void windowClosing(WindowEvent we) {
        JOptionPane.showMessageDialog(frame, "Good Bye");
    }    
}
private class MouseMotionHandler extends MouseMotionAdapter
{
    public void mouseDragged(MouseEvent me)
    {
        System.out.println("Mouse was dragged on the frame");
    }
}
}

public class Test {

    
    public static void main(String[] args) {
        new GUI();
    }
    
}
