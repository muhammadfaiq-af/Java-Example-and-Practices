import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class GUI
{
    int save;
    Connection con;
    ResultSet rs;
    Statement st;
    JFrame frame;
    JPanel textPanel,buttonPanel;
    JLabel labelID, labelName, labelAddress;
    JTextField textID, textName, textAddress;
    JButton btnFirst, btnPrevious, btnNext, btnLast,btnExit,btnInsert, btnDelete,
            btnUpdate,btnSave,btnCancel;
    public void init()
    {
        frame = new JFrame("Student Database");
        textPanel = new JPanel();
        buttonPanel = new JPanel();
        labelID = new JLabel("Student ID");
        labelName = new JLabel("Student Name");
        labelAddress = new JLabel("Student Address");
        textID = new JTextField(10);textName = new JTextField(10);textAddress = new JTextField(10);
        btnFirst = new JButton("First");btnPrevious = new JButton("Previous");
        btnNext = new JButton("Next");btnLast = new JButton("Last");
        btnExit = new JButton("Exit");btnInsert = new JButton("Insert");
        btnDelete = new JButton("Delete");btnUpdate = new JButton("Update");
        btnSave = new JButton("Save");btnCancel = new JButton("Cancel");
        textPanel.setLayout(new GridLayout(3,2,25,30));
        textPanel.add(labelID);textPanel.add(textID);
        textPanel.add(labelName);textPanel.add(textName);
        textPanel.add(labelAddress);textPanel.add(textAddress);

        buttonPanel.setLayout(new GridLayout(2,5,5,5));
        buttonPanel.add(btnFirst);buttonPanel.add(btnPrevious);buttonPanel.add(btnNext);
        buttonPanel.add(btnLast);buttonPanel.add(btnExit);buttonPanel.add(btnInsert);
        buttonPanel.add(btnDelete);buttonPanel.add(btnUpdate);buttonPanel.add(btnSave);
        buttonPanel.add(btnCancel);

        frame.add(textPanel,BorderLayout.NORTH);
        frame.add(buttonPanel,BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter()        
        {
        public void windowClosing(WindowEvent we)
        {
        int option = JOptionPane.showConfirmDialog(frame, "Do you really want to exit?","Exit Application",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (option == 1)
        {
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
 else
        {
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         try
         {
         con.close();
         }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(frame,e);
                }

 }

            }
        });
        btnFirst.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
            {
             try
             {
             if (rs.isFirst())
                 JOptionPane.showMessageDialog(frame,"You are on the first record","First Record",JOptionPane.INFORMATION_MESSAGE);
             else if (textID.getText().equals(""))
             {
                 rs.beforeFirst();
                 JOptionPane.showMessageDialog(frame, "No Records to navigate","No Records",JOptionPane.ERROR_MESSAGE);
             }
             else
             {
                 rs.first();
                 getData();
            }

             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
            }
        });
        btnPrevious.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
         try
             {
             if (rs.isFirst())
                 JOptionPane.showMessageDialog(frame,"You are on the first record","First Record",JOptionPane.INFORMATION_MESSAGE);
             else if (textID.getText().equals(""))
                 {
                 rs.beforeFirst();
                 JOptionPane.showMessageDialog(frame, "No Records to navigate","No Records",JOptionPane.ERROR_MESSAGE);
             }
                 else
             {
                 rs.previous();
                 getData();
                 }

             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
        }
            
        });

        btnNext.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
            {
            try
             {
             if (rs.isLast())
                 JOptionPane.showMessageDialog(frame,"You are on the last record","Last Record",JOptionPane.INFORMATION_MESSAGE);
             else if (textID.getText().equals(""))
                 {
                 rs.beforeFirst();
                 JOptionPane.showMessageDialog(frame, "No Records to navigate","No Records",JOptionPane.ERROR_MESSAGE);
             }
                 
             else
             {
                 rs.next();
             getData();
                 }
                }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
        }
        });

        btnLast.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
            try
             {
             if (rs.isLast())
                 JOptionPane.showMessageDialog(frame,"You are on the last record","Last Record",JOptionPane.INFORMATION_MESSAGE);
             else if (textID.getText().equals(""))
             {
                 rs.beforeFirst();
                 JOptionPane.showMessageDialog(frame, "No Records to navigate","No Records",JOptionPane.ERROR_MESSAGE);
             }
             else
             {
                 rs.last();
                 getData();
                 }
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
        }
        });
        btnExit.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
            {
            int option = JOptionPane.showConfirmDialog(frame, "Do you really want to exit?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (option == 0)
            {
                System.exit(0);
                try
                {
                  con.close();  
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(frame, e);
                }
                }
        }
        });
        
        btnInsert.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
            {
            enableText();
            textID.setText("");
            textName.setText("");
            textAddress.setText("");
            textID.requestFocus(true);
            save = 1;
            }
        });
        btnUpdate.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
            enableText();
            textID.setEditable(false);
            textName.requestFocus(true);
            save = 2;   
        }
        });
btnSave.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
    if (save == 1)
    {
        if(textID.getText().equals("") || textName.getText().equals("") || textAddress.getText().equals(""))
        {
         JOptionPane.showMessageDialog(frame, "Enter data in all fields","Enter Data",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
        st.executeUpdate("INSERT INTO STUDENT VALUES(" + textID.getText() + ",'" + textName.getText()+"','" + textAddress.getText()+"')");
            // rs.moveToInsertRow();
             //rs.updateInt(1, Integer.parseInt(textID.getText()));
             //rs.updateString(2, textName.getText());
             //rs.updateString(3, textAddress.getText());
             //rs.insertRow();
            JOptionPane.showMessageDialog(frame, "Record inserted successfully","Record Inserted",JOptionPane.INFORMATION_MESSAGE);
            disableText();
                
            rs = st.executeQuery("SELECT * FROM STUDENT");
            if(rs.next())
                {
                    getData();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame, e);
            }
        }
    }
    else if (save == 2)
    {
        if (textName.getText().equals("") || textAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(frame, "Enter data in all fields","Enter Data",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
        st.executeUpdate("UPDATE STUDENT SET NAME = '" + textName.getText() + "',Address = '" + textAddress.getText()+"' WHERE ID = " + textID.getText());
        JOptionPane.showMessageDialog(frame, "Record updated successfully");
        disableText();
        
        rs = st.executeQuery("SELECT * FROM STUDENT");
        if (rs.next())
        {
          getData();  
        }
        }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame,e);
            }
        }
    }
}
});

btnCancel.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
    disableText();
    getData();
}
});
btnDelete.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
    try
    {
    if (!(textID.getText().equals("")))
    {
    int option = JOptionPane.showConfirmDialog(frame,"Do you really want to delete?","Delete Record",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if (option == 0)
    {
            //rs.deleteRow();
            //rs.close();
            st.executeUpdate("DELETE FROM STUDENT WHERE ID = " + textID.getText());
            JOptionPane.showMessageDialog(frame, "Record deleted successfully");
            rs = st.executeQuery("SELECT * FROM STUDENT");
            if (rs.next())
            {
                getData();
            }
 else
            {
                textID.setText("");
                textName.setText("");
                textAddress.setText("");
 }
        }
    }
 else
{
        JOptionPane.showMessageDialog(frame,"There is no record to delete","No Record",JOptionPane.ERROR_MESSAGE);
 }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(frame, e);
    }
            }
        });
    }
public void getData()

    {
        try
            {
        
        textID.setText(rs.getInt(1) + "");
        textName.setText(rs.getString(2));
        textAddress.setText(rs.getString(3));
    }
     catch(Exception e)
            {
        JOptionPane.showMessageDialog(null, e);
    }
    }

    public void enableText()
    {
     textID.setEditable(true);  textName.setEditable(true);textAddress.setEditable(true);
     btnFirst.setEnabled(false); btnPrevious.setEnabled(false); btnNext.setEnabled(false);
      btnLast.setEnabled(false); btnExit.setEnabled(false); btnInsert.setEnabled(false);
       btnDelete.setEnabled(false); btnUpdate.setEnabled(false); btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }
    public void disableText()
    {
    textID.setEditable(false);  textName.setEditable(false);textAddress.setEditable(false);
     btnFirst.setEnabled(true); btnPrevious.setEnabled(true); btnNext.setEnabled(true);
      btnLast.setEnabled(true); btnExit.setEnabled(true); btnInsert.setEnabled(true);
       btnDelete.setEnabled(true); btnUpdate.setEnabled(true); btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
    }
    public GUI()
    {
        init();
        try
        {
        
        con = DriverManager.getConnection("jdbc:ucanaccess://C:/random database/random database.accdb");
        st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs = st.executeQuery("SELECT * FROM STUDENT");
        
        if(rs.next())
        {
        getData();
        disableText();             
        }
        else
        {
            disableText();
            JOptionPane.showMessageDialog(frame, "No Records To Show","No Records",JOptionPane.INFORMATION_MESSAGE);
        }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
    }

}
public class Main {

    public static void main(String[] args) {
      new GUI();
    }

}
