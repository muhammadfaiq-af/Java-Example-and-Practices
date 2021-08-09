import javax.swing.JOptionPane;

public class Throws {

   
    public static void main(String[] args) //throws ArithmeticException
    {
        int myInput;
        String myNumber;
        try
        {
        myNumber=JOptionPane.showInputDialog(null,"Enter the value");
        myInput=Integer.parseInt(myNumber);
        
        if(myInput < 0 || myInput > 20)
            throw new ArithmeticException();
        else
            JOptionPane.showMessageDialog(null,"Value has been Saved");
        
        
    }
    
    catch(RuntimeException ae)
    {
        JOptionPane.showMessageDialog(null, ae);
    }
    
}
}