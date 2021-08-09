import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CheckBoxFrame
{
    JTextField textField;
    JCheckBox boldCheckBox;
    JCheckBox italicCheckbox;
    JFrame frame;
    Font font;
   public void init()
    {
       frame = new JFrame("Testing Check Boxes");
       frame.setLayout(new FlowLayout());
       textField = new JTextField("Watch the font style change",20);
       font = new Font("Arial",Font.PLAIN,14);
       textField.setFont(font);
       frame.add(textField);
       boldCheckBox = new JCheckBox("Bold");
       italicCheckbox = new JCheckBox("Italic");
       frame.add(boldCheckBox);
       frame.add(italicCheckbox);
       CheckBoxHandler handler = new CheckBoxHandler();
       boldCheckBox.addItemListener(handler);
       italicCheckbox.addItemListener(handler);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(275,100);
       frame.setResizable(false);
   }
   public CheckBoxFrame()
    {
       init();
   }
   private class CheckBoxHandler implements ItemListener
   {
       private int valBold = Font.PLAIN;
       private int valItalic = Font.PLAIN;

       public void itemStateChanged(ItemEvent event)
       {
           if (event.getSource() == boldCheckBox)
               valBold = boldCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
           if(event.getSource() == italicCheckbox)
               valItalic = italicCheckbox.isSelected() ? Font.ITALIC : Font.PLAIN;

           textField.setFont(new Font("Arial", valBold + valItalic, 14));
       }
   }
}
public class Test {
    public static void main(String[] args) {
      CheckBoxFrame frame = new CheckBoxFrame();
    }
}