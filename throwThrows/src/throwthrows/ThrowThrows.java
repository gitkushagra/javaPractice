// Rectangle Area Calculator
package throwthrows;

class NegativeSidesException extends Exception
{
    @Override
    public String toString()
    {
        return "Please avoid negative dimensions!";
    }
}

public class ThrowThrows {

    static int area(int l,int b) throws /*Exception*/ NegativeSidesException
    {
        if (l<0 || b<0)
            throw new NegativeSidesException();
        return l*b;
    }
    static void meth() throws NegativeSidesException
    {
        System.out.println("Area is:"+area(10,5));
    }
   
    public static void main(String[] args)/* throws Exception */{
        try{
               meth();
        }
        catch(NegativeSidesException e)
        {
            System.out.println(e);
        }
        
        System.out.println("Good Bye!");
    
    }
    
}
