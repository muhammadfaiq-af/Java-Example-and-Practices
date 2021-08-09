
import javax.swing.JOptionPane;


public class main {
    
    public static void main(String[] args) 
   
    {
    // general exception, 
        
      /*
        hierarcy of classes 
        object-throwable 
        throwable-error,exception
        exception-classnotfound,ioexceptio,awtexxception,runtimeexception-arithematic exception, null pointer exception, indexout of bound exception,several other classes.. several other classes
        
        */
        //now we trying to write a catch block for several exceptions from try block 
        boolean repeat = true;
        while(repeat==true)
        {
        try
        {
            String number = JOptionPane.showInputDialog("Enter your first Number:" );
            int num1;
           num1 = Integer.parseInt(number);
           number = JOptionPane.showInputDialog("Enter your second Number:" );
           int num2;
           num2 = Integer.parseInt(number);
           int ans = num1/num2;
            System.out.println("the result of division is = " + ans);
            System.out.println("the program will terminate now");
           repeat = false;
           
        }
        catch(Exception ee)//capable to caught all exceptions included in the exception class
        {
            JOptionPane.showMessageDialog(null, "Error occured Try again");//we are giving a generalized msg because any exception can occur
      //but if you want to watch specialized message then we have a way to do it.
        JOptionPane.showMessageDialog(null, ee.toString());
        }
        
        //in java exception handling we have five key words
        // try , catch , throw , throws , finally
        // try , catch and finally are block of codes
        //but throw and throws are not block of codes
//finally block of code comes after try and catch and its code will execute in any circumstances wheather exception occurs or not
//we use it normally in jdbc, networks programming and file handling programming . where we take resources from system and we want to give resources back to system in finally code
//in every dbms there is limitation for number of connections wheneven a user connected to database then there established a physical connection and until the connection is established we cannot run our quieries on it
//in access there is very limited capability of connections
//the connection b/w the database and java is the resource so we should have to return it.
//for eg we make a program in jdbc and our database is in server room, and all the computers in different offices in vc office , in accounts offices etc 50 computers are connected with database as in access the capability to connect user is only 50 but when 51th user tries to connect to database then he cannnot
//so it is necessary to break connection 
//in finally block of code we write the code to break the connection
// so in file handling in windows we open a file by double click the file resides in hardisk after click it goes to raam
//for eg java program reads it so first you need to open that file to read or write in that filee so when you finished your work you will write a code in finally to close that file to remove from ramm.
//if we donot do like that then the file will resides in the raam at the same time program has been terminated

finally
        {
            JOptionPane.showMessageDialog(null, "the program will terminate now (written in finally)");
        }

        
        
        
        
        
        
        
        
        
        }
    }
}
