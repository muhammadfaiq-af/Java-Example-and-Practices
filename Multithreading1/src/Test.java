class Hello extends Thread
{
public void run()
{
    for (int i = 0;i<10;i++)
    {
        System.out.println("HELLO");
        try{Thread.sleep(500);}catch(Exception e){}
    }
    }
}
class Hi extends Thread
{
public void run()
{
    for (int i = 0;i<10;i++)
    {
        System.out.println("HI");
        try{Thread.sleep(500);}catch(Exception e){}
}
}
}
public class Test {
public static void main(String[] args) {
Hello obj1 = new Hello();
Hi obj2 = new Hi();
obj1.start();
try{Thread.sleep(20);}catch(Exception e){}
obj2.start();
}
    
}
