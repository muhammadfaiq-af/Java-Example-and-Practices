import java.sql.*;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Connection con = null;
        try
        {
       con = DriverManager.getConnection("jdbc:ucanaccess://E:/Student Information System.mdb");
       PreparedStatement searchByAddress = con.prepareStatement("SELECT * FROM STUDENT WHERE ADDRESS = ?");
      System.out.println("Enter value of address to see its record");
       String address =  input.next();
      searchByAddress.setString(1, address);
      
      ResultSet rs = searchByAddress.executeQuery();
      while (rs.next())
      {
          System.out.println(rs.getInt("ID") + "------" + rs.getString("NAME") + "------" + rs.getString("ADDRESS"));
      }
      
      }
        catch(Exception e)
        {
            System.out.println(e);
    }
        finally
        {
         try{
            if (con!= null)
            {
                con.close();
            }
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    
}
}
}
