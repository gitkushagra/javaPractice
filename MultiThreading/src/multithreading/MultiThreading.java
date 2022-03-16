
package multithreading;

class MyThread extends Thread
{
    @Override
    public void run()
    {
    int i = 0;
    while(true)
     {
        System.out.println(i+"Hello");
        i++;
     } 
    }
    
}

public class MultiThreading {

    
    public static void main(String[] args) {
       MyThread t = new MyThread();
       t.start();
       
       int i = 0;
       while(true)
       {
           System.out.println(i+" World");
           i++;
       }
    }
    
}
