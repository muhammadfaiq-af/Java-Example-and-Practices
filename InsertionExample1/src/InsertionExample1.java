import java.util.Scanner;
import java.sql.*;
public class InsertionExample1 {

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Connection c = null;
        Statement s = null;
        ResultSet rs = null;
        int ID=0;
        String Book_Name=null;
        String Book_Author=null;
        String Book_Publisher=null;
        int Quantity=0;
        int Price=0;
        
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
           
            System.out.println("Enter ID");
            ID=input.nextInt();
            System.out.println("Enter Book Name");
            Book_Name=input.next();
            System.out.println("Enter Book Author");
           Book_Author=input.next();
           System.out.println("Enter Book Publisher");
           Book_Publisher=input.next();
           System.out.println("Enter Quantity");
           Quantity=input.nextInt();
           System.out.println("Enter Price");
           Price=input.nextInt();
           
           
            int records = s.executeUpdate("INSERT INTO BOOKS(ID,BOOKNAME,BOOKAUTHOR,BOOKPUBLISHER,QUANTITY,PRICE) VALUES (" + ID + ",'"+Book_Name+"','"+Book_Author+"','"+Book_Publisher+"',"+Quantity+","+Price+")");
            
            rs=s.executeQuery("select * from Books");
           // System.out.println(rs.getInt("ID") + rs.getString(Book_Name) + rs.getString(Book_Author) + rs.getString(Book_Publisher)+ rs.getInt(Quantity) + rs.getInt(Price));
            
            while(rs.next())
            {
                System.out.println(rs.getInt(ID) + rs.getString(Book_Name) + rs.getString(Book_Author) + rs.getString(Book_Publisher)+ rs.getInt(Quantity) + rs.getInt(Price));
            }
        }
        catch(Exception re)
        {
            System.out.println(re);
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
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    
}
