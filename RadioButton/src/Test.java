import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyRadioButton
{
    JFrame frame;
    JTextField textField;
    Font plainFont;
    Font italicFont;
    Font boldFont;
    Font boldItalicFont;
    JRadioButton plainRadioButton;
    JRadioButton italicRadioButton;
    JRadioButton boldRadioButton;
    JRadioButton boldItalicRadiobutton;
    ButtonGroup radioGroup;
    public void init()
    {
 frame = new JFrame("Testing Radio Buttons");
 Container con = frame.getContentPane();
 con.setBackground(Color.red);
 con.setLayout(new FlowLayout());
 textField = new JTextField("Watch the font change the style",25);
 con.add(textField);
 plainRadioButton = new JRadioButton("Plain",true);
 italicRadioButton = new JRadioButton("Italic",false);
 boldRadioButton = new JRadioButton("Bold",false);
 boldItalicRadiobutton = new JRadioButton ("Bold/Italic",false);
  plainRadioButton.setBackground(Color.red);
 plainRadioButton.setForeground(Color.white);
  italicRadioButton.setBackground(Color.red);
 italicRadioButton.setForeground(Color.white);
  boldRadioButton.setBackground(Color.red);
 boldRadioButton.setForeground(Color.white);
  boldItalicRadiobutton.setBackground(Color.red);
 boldItalicRadiobutton.setForeground(Color.white);
 con.add(plainRadioButton);
 con.add(italicRadioButton);
 con.add(boldRadioButton);
 con.add(boldItalicRadiobutton);
 radioGroup = new ButtonGroup();
 radioGroup.add(plainRadioButton);
 radioGroup.add(boldRadioButton);
 radioGroup.add(italicRadioButton);
 radioGroup.add(boldItalicRadiobutton);

 plainFont = new Font("Times New Roman",Font.PLAIN,14);
 italicFont = new Font("Times New Roman",Font.ITALIC,14);
 boldFont = new Font("Times New Roman",Font.BOLD,14);
 boldItalicFont = new Font("Times New Roman",Font.BOLD + Font.ITALIC,14);
 textField.setFont(plainFont);
 frame.setVisible(true);
 frame.setSize(300,100);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setResizable(false);

 RadioButtonHandler handler = new RadioButtonHandler();
 plainRadioButton.addItemListener(handler);
 italicRadioButton.addItemListener(handler);
 boldRadioButton.addItemListener(handler);
 boldItalicRadiobutton.addItemListener(handler);
}
    public MyRadioButton()
    {
        init();
    }
private class RadioButtonHandler implements ItemListener
{
    public void itemStateChanged(ItemEvent event)
    {
        if (event.getSource() == plainRadioButton)
            textField.setFont(plainFont);
        if(event.getSource() == italicRadioButton)
            textField.setFont(italicFont);
        if(event.getSource() == boldRadioButton)
            textField.setFont(boldFont);
        if(event.getSource() == boldItalicRadiobutton)
            textField.setFont(boldItalicFont);

    }

}

}

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyRadioButton b = new MyRadioButton();
    }

}
