import java.sql.*;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Connection con= null;
        
        try
        {
        con = DriverManager.getConnection("jdbc:ucanacess://E:/Student Information System.mdb");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM STUDENT WHERE ADDRESS = ?");
        System.out.println("Enter the student address to search on the basis of Address\n");
        String address = input.next();
        
        pst.setString(1, address);
        ResultSet rs = pst.executeQuery();
        while(rs.next())
        {
        System.out.println(rs.getInt("ID") + "----" + rs.getString("name") + "----" + rs.getString("Address"));
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
                if (con!= null)
                    con.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    
}
