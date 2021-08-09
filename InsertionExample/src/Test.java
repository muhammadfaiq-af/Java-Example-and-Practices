import java.sql.*;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) 
    {
        int ID;
        String Book_Name;
        String Book_Author;
        String Book_Publisher;
        int Quantity;
        int Price;
        
        
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
            
            
            System.out.println("Enter ID");
            ID=input.nextInt();
            
            System.out.println("Enter Book_Name");
            Book_Name=input.next();
            
            System.out.println("Enter Book_Author");
            Book_Author=input.next();
            
            System.out.println("Enter Book_Publisher");
            Book_Publisher=input.next();
            
            System.out.println("Enter Quantity");
            Quantity=input.nextInt();
            
            System.out.println("Enter Price");
            Price=input.nextInt();
            
            
            //int records = s.executeUpdate("Insert into Books values("+ ID + ",'" + Book_Name + "','" + Book_Author + "','" + Book_Publisher + "'," + Quantity + "," + Price + ")");
            int records = s.executeUpdate("INSERT INTO BOOKS(ID,BOOKNAME,BOOKAUTHOR,BOOKPUBLISHER,QUANTITY,PRICE) VALUES (" + ID + ",'"+Book_Name+"','"+Book_Author+"','"+Book_Publisher+"',"+Quantity+","+Price+")");
            System.out.println(records + " Records inserted successfully ");           
            rs=s.executeQuery("Select * from Books");
            
            while(rs.next())
            {
            System.out.println(rs.getInt("ID") + "\t\t" + rs.getString("BOOKNAME") + "\t\t" + rs.getString("BOOKAUTHOR") + "\t\t" + rs.getString("BOOKPUBLISHER") + "\t\t" + rs.getInt("QUANTITY") + "\t\t" + rs.getInt("PRICE"));
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
