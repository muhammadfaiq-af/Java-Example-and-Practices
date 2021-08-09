import java.sql.*;
public class JDBC {
    public static void main(String[] args) 
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException nfe)
        {
            System.out.println("Error in Loading Program");
        }
        
        try
        {
            String msaccdb= "D:/Student Info.accdb";
            String dbURL="jdbc:ucanaccess://" + msaccdb;
            
            connection=DriverManager.getConnection(dbURL);
            statement=connection.createStatement();
            rs=statement.executeQuery("Select * from Student");
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "\t\t\t" + rs.getString(2) + "\t\t\t" + rs.getString(3));
                
                Thread.sleep(500);
            }         
        }       
        catch(Exception ae)
        {
            System.out.println(ae);
        }
        finally
        {
            try
            {
            if(connection!=null)
                connection.close();
            System.out.println("Connection Closed");
        }
        
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
    
}
}
