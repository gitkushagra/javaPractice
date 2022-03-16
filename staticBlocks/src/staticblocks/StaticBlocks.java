
package staticblocks;

class Harsh
{
    static
    {
        System.out.println("Hiiiii! class block 1");
    }
    static
    {
        System.out.println("Hiiiii! class block 2");
    }
}

public class StaticBlocks {

     static
    {
        System.out.println("Hi! Block 1");
    }
    
    public static void main(String[] args) {
       Harsh s = new Harsh();
      System.out.println("Main");
    }
    static
    {
        System.out.println("Hi! Block 2");
    }
    
}
