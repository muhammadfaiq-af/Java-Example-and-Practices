import javax.swing.JOptionPane;
class InvalidInputException extends Exception
{
public InvalidInputException()
{
    super("Enter age of student between 4 and 10 years");
}
}
public class Test {

    
    public static void main(String[] args) 
    {
     int age;
     String input;
     input = JOptionPane.showInputDialog("Enter the age of student");
     age = Integer.parseInt(input);
     try
     {
     if (age < 4 || age > 10)
         throw new InvalidInputException();
     else
         JOptionPane.showMessageDialog(null, "Age entered successfully");
    }
    catch(InvalidInputException iie)
    {
     JOptionPane.showMessageDialog(null,iie);   
    }
    }
    
}
