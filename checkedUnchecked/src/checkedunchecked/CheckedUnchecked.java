
package checkedunchecked;

//import java.io.*;

class LowBalanceException extends Exception //Checked Exception
{
    @Override
    public String toString() //Very Important
    {
        return "Low Balance!";
    }
}

public class CheckedUnchecked {
    
    static void fun3()
    {
       // FileInputStream f1 = new FileInputStream("MyFile.txt"); //Unchecked Exception
        try{
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }
    
    static void fun2()
    {
        fun3();
    }

    static void fun1()
    {
        fun2();
    }
    public static void main(String[] args) {
      fun1();
    }
    
}
