import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test implements ItemListener,ActionListener{
JFrame frame;
MyPanel panel;
JComboBox cmb;
JPanel comboPanel;
JTextField xVal,yVal,wText,hText;
JLabel lblX,lblY,lblW,lblH,lblShape;
JButton button,draw;
Color color;

public void init()
    {
    button = new JButton("Choose Shape's Color");
    draw = new JButton("Draw Shape");
    lblShape = new JLabel("Select Shape");
    lblW = new JLabel("Shape's Width");
    lblH = new JLabel("Shape's Height");
    wText = new JTextField(3);
    hText = new JTextField(3);
    lblX = new JLabel("X Coordinate");
    lblY = new JLabel("Y Coordinate");
    xVal = new JTextField(3);
    yVal = new JTextField(3);
    frame = new JFrame();
    comboPanel = new JPanel();

    panel = new MyPanel();
    cmb = new JComboBox();
    cmb.addItem("Draw Non Filled Circle");
    cmb.addItem("Draw Non Filled Rectangle");
    cmb.addItem("Draw Filled Circle");
    cmb.addItem("Draw Filled Rectangle");
    cmb.addItem("Draw Round Rectangle");
    cmb.addItem("Draw Filled Round Rectangle");
    frame.setLayout(new BorderLayout());
    comboPanel.add(lblX);
    comboPanel.add(xVal);
    comboPanel.add(lblY);
    comboPanel.add(yVal);
     comboPanel.add(lblW);
    comboPanel.add(wText);
    comboPanel.add(lblH);
    comboPanel.add(hText);
    
    comboPanel.add(button);
    comboPanel.add(lblShape);
    comboPanel.add(cmb);
   comboPanel.add(draw);
    frame.add(comboPanel,BorderLayout.NORTH);
    frame.add(panel,BorderLayout.CENTER);
    cmb.setSelectedIndex(-1);
    frame.setVisible(true);
frame.setSize(1200,700);
    //comboPanel.setPreferredSize(new Dimension(1000,(int)Math.round(frame.getHeight() * 0.10)));
    //panel.setSize(1000, (int)Math.round(frame.getHeight() * 0.80));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setResizable(false);
    cmb.addItemListener(this);
    draw.addActionListener(this);
    //comboPanel.setBackground(Color.red);
   // panel.setBackground(Color.YELLOW);
    button.addActionListener(this);
}
public Test()
    {
    init();
}
public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == button)
        {
    color = JColorChooser.showDialog(frame, "Choose the color of your shape", Color.BLACK);
    if (color == null)
        color = Color.BLACK;

panel.color = color;
panel.repaint();
}
        else if (ae.getSource() == draw)
        {
            panel.repaint();
        }
    }
public void itemStateChanged(ItemEvent it)
{
    int x,y,w,h;
    try{
    x = Integer.parseInt(xVal.getText());
    y = Integer.parseInt(yVal.getText());
    w = Integer.parseInt(wText.getText());
    h = Integer.parseInt(hText.getText());
    //if(it.getStateChange() == ItemEvent.SELECTED)
    //{
        panel.choice = cmb.getSelectedIndex();
        panel.x = x;
        panel.y = y;
        panel.width = w;
        panel.height = h;
        
        
    //}

}
catch(NumberFormatException nfe)
    {
        JOptionPane.showMessageDialog(frame,"Please enter valid values for the X,Y coordinates\n And for the Width and Height");
        xVal.setText("");
        yVal.setText("");
        wText.setText("");
        hText.setText("");
        
        
    }
    }
public static void main(String[] args)
    {
    Test ok = new Test();
}
}
