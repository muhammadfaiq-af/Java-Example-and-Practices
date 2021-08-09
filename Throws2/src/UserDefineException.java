import javax.swing.*;
class InvalidInputException extends Exception
{
    public InvalidInputException()
    {
        super("Enter age of student between 0 and 20");
    }
    
}
public class UserDefineException{

    
    public static void main(String[] args) throws InvalidInputException
    {
        int age;
        String input;
        try
        {
        input=JOptionPane.showInputDialog(null,"Enter Age between 4 and 20");
        age=Integer.parseInt(input);
        
        if(age < 0 || age > 20)
        throw new InvalidInputException();
        else
            JOptionPane.showMessageDialog(null,"Age has been Saved");
        }
        catch(InvalidInputException iie)
        {
            JOptionPane.showMessageDialog(null,iie);
        }
        
    }
    
}
