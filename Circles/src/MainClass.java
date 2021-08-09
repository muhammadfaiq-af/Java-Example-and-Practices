import javax.swing.*;
public class MainClass {
    JFrame frame;
    MyPanel panel;
    
    public MainClass()
    {
        frame = new JFrame ();
        panel = new MyPanel();
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        new MainClass();
    }
}
