import java.sql.*;
import java.util.Scanner;

public class DeletionExample {
    public static void main(String[] args) 
    {
             int ID;
       
        Connection c =null;
        Statement s= null;
        ResultSet rs=null;
        Scanner input = new Scanner(System.in);
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException er)
        {
            System.out.println("Error in Loading Program");
        }
        
        try
        {
            String msaccdb ="D:/Random DataBase.accdb";
            String dbURL = "jdbc:ucanaccess://" + msaccdb;
            
            c=DriverManager.getConnection(dbURL);
            s=c.createStatement();
            
            
            System.out.println("Enter ID to Delete");
            ID=input.nextInt();
            
            
            int records = s.executeUpdate("Delete From MF_Organization where ProductID = " + ID);
            System.out.println(records + "Record Del Succescfully");
            rs=s.executeQuery("Select * from MF_Organization");
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getInt(5));
            }
           
        }
        catch(SQLException e)
        {
            System.out.println(e);   
        }
        
        finally
        {
            try
            {
              if(c !=null)  
              {
              System.out.println("Connection Closed");
              c.close();
              }
            }     
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    
}
