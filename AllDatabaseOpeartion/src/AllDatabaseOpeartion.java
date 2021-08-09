import java.util.Scanner;
import java.sql.*;
public class AllDatabaseOpeartion {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
         Connection c=null;
         Statement s=null;
         ResultSet rs = null;
         
         int ID;
         String Name;
         String Address;
         int RollNumber;
         int option;
         
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
             String msAccdb = "C:/random DataBase/random database.accdb";
             String dbURL = "jdbc:ucanaccess://"+msAccdb;
             
             c=DriverManager.getConnection(dbURL);
             s=c.createStatement();
             do
             {
             System.out.println("*************************************");
             System.out.println("1* Press 1 for View The Whole Records *");
             System.out.println("2* Press 2 for insert the data        *");
             System.out.println("3* Press 3 for Update the Data        *");
             System.out.println("4* press 4 for delete the Data        *");
             System.out.println("5* Press 5 for the relavent Data      *");
             System.out.println("*************************************");
             
             option=input.nextInt();
             switch(option)
             {
                 case 1:
                     rs=s.executeQuery("select * from Student");
                     
                     while(rs.next())
                     {
                         System.out.println(rs.getInt(1) +"\t\t"+ rs.getString(2) +"\t\t"+ rs.getString(3) +"\t\t"+ rs.getInt(4));   
                     }
                     break;
                     
                 case 2:
                     System.out.println("Enter ID");
                     ID = input.nextInt();
                     System.out.println("Enter Name");
                     Name=input.next();
                     System.out.println("Enter Address");
                     Address=input.next();
                     System.out.println("Enter RollNumber");
                     RollNumber=input.nextInt();
             
                     int records =s.executeUpdate("Insert into Student Values(" + ID + ",'" + Name + "','" + Address + "'," + RollNumber + ")");
                     System.out.println(records + "Record Inserted Successfully");
                     break;
                     
                     
                 case 3:
                     System.out.println("Enter ID");
                     ID = input.nextInt();
                     System.out.println("Enter Name");
                     Name=input.next();
                     System.out.println("Enter Address");
                     Address=input.next();
                     System.out.println("Enter RollNumber");
                     RollNumber=input.nextInt();
                     
                     records=s.executeUpdate("Update Student set  Name = '" + Name + "',Address ='" + Address + "',RollNumber =" + RollNumber + " Where ID = " + ID);
                     System.out.println("Record Has been Updated SuccessFully");
                     break;        
                     
                 case 4:
                     System.out.println("Enter the ID u want To delete");
                     ID=input.nextInt();
                     records =s.executeUpdate("Delete From Student where ID =" + ID);
                     break;
                     
                 case 5:
                     System.out.println("Enter The Name U want to search");
                     Name=input.next();
                     
                     rs=s.executeQuery("Select * from Student Where Name ='" + Name + "'");
                     
                     
                     while(rs.next())
                     {
                         System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getInt(4)); 
                     }
             }
                     System.out.println("Do you wish to Continue?? Y/N");
                     Name=input.next();
             }while(Name.equals("Y"));
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
    
             