
package dividebyzeroexception;



public class Dividebyzeroexception {

    static int divide(int a,int b)
    {
        return a/b;
    }
    
    public static void main(String[] args) {
           try{
            System.out.println("The answer is "+divide(1,2));
           }
           catch(Exception e)
           {
               System.out.println("Error is: "+e.getMessage());
           }
           finally{
                  System.out.println("Bye!");
           }
           
    }
    
}
