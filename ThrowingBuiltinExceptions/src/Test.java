import javax.swing.JOptionPane;
public class Test {

 public static void main(String[] args) 
    {
    int myInput;
    String myNumber;
    
   myNumber = JOptionPane.showInputDialog("Enter your input");
   myInput = Integer.parseInt(myNumber);
   try
   {
   if (myInput < 0 || myInput > 20)
        throw new ArithmeticException();
   else
       JOptionPane.showMessageDialog(null, "Your input was valid, input saved successfully");
    }
   catch(ArithmeticException ae)
   {
     JOptionPane.showMessageDialog(null, "Enter input more than 0 and less than 21");  
   }
    }
    
}
