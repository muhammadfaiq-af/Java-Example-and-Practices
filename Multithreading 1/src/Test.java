public class Test {
    public static void main(String[] args) 
    {
     Thread t1 = new Thread(() ->
    {
        for (int i = 0;i<10;i++)
        {
            System.out.println("Hello");
            try{
            Thread.sleep(500);
        }
       catch(Exception e)
        {}
        }
    },"Hello Thread");
     Thread t2 = new Thread(()->
    {
        for (int i = 0;i<10;i++)
        {
            System.out.println("Hi");
             try{
            Thread.sleep(500);
        }
       catch(Exception e)
        {}
        }    
    },"Hi Thread");
     
System.out.println("The new name of Thread T1 is " + t1.getName());
System.out.println("The new name of Thread T2 is " + t2.getName());
System.out.println("Thread T1 isAlive() " + t1.isAlive());
System.out.println("Thread T2 isAlive() " + t2.isAlive());
     //obj1.start();
     t1.start();
      try{
            Thread.sleep(30);
        }
       catch(Exception e)
        {}
     //obj2.start();
     t2.start();
     System.out.println("Thread T1 isAlive() " + t1.isAlive());
     System.out.println("Thread T2 isAlive() " + t2.isAlive());
     try{
     t1.join();
     t2.join();
     }
     catch(Exception e)
     {
         
     }
    System.out.println("Thread T1 isAlive() " + t1.isAlive());
    System.out.println("Thread T2 isAlive() " + t2.isAlive());
    System.out.println("Good Bye, the program will terminate now");
    }
}
