import java.sql.*;
import java.util.Scanner;

public class DeletionExample2 {
    public static void main(String[] args)
    {
        Connection c= null;
        Statement s=null;
        ResultSet rs = null;
        int ID;
        Scanner input = new Scanner(System.in);
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("error in program Loading");
        }
        try
        {
            String msAccdb = "D:/Random DataBase.accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccdb;
            
            c=DriverManager.getConnection(dbURL);
            s=c.createStatement();
            
            System.out.println("Enter ID You Want To Delete");
            ID=input.nextInt();
            
            int records=s.executeUpdate("Delete From MF_Organization where ProductID = " + ID);
            System.out.println(records + "No of records Deleted ");
            rs=s.executeQuery("select * from MF_Organization");
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ "/t/t" + rs.getString(2) + "/t/t" + rs.getInt(3) + "/t/t" + rs.getInt(4) + "/t/t" + rs.getInt(5));
            }
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
 