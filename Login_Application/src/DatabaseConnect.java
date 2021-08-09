import java.sql.*;
public class DatabaseConnect {

public static Connection con = null;

public static Connection connect()
{
 try
 {
     con = DriverManager.getConnection("jdbc:ucanaccess://E:/Student Information System.mdb");
     
 }
 catch(Exception e)
 {
     System.out.println(e);
 }
if (con!= null)
    return con;
else 
    return null;
}
}

