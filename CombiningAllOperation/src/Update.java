import java.util.Scanner;
import java.sql.*;
public class Update {
    public static void main(String[] args) 
    {
        Connection c=null;
        Statement s=null;
        ResultSet rs=null;
        
        int ID;
        String Book_Name;
        String Book_Author;
        String Book_Publisher;
        int Quantity;
        int Price;
        Scanner input = new Scanner(System.in);
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error in Program Loading");
        }
        try
        {
            String msAccdb = "D:/Random DataBase.accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccdb;
            
            c=DriverManager.getConnection(dbURL);
            s=c.createStatement();
            
            System.out.println("Enter the ID wich  want to Update");
            ID=input.nextInt();
            System.out.println("Enter the Updated Book Name");
            Book_Name=input.next();
            System.out.println("Enter the Upadted Book Author");
            Book_Author=input.next();
            System.out.println("Enter the Updated Book Publisher");
            Book_Publisher=input.next();
            System.out.println("Enter the Updated Quantity");
            Quantity=input.nextInt();
            System.out.println("Enter the Updated Price");
            Price=input.nextInt();
            //System.out.println(Book_Name);
            
            int records = s.executeUpdate("Update Books Set BookName = '" + Book_Name + "',BookAuthor='" + Book_Author + "',BookPublisher='" +Book_Publisher + "',Quantity =" + Quantity + ",Price ="+ Price + " Where ID = " + ID);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                if(c !=null)
                {
                    c.close();
                    System.out.println("Connection Closed");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
    
}
