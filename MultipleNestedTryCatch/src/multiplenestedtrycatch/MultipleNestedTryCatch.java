
package multiplenestedtrycatch;



public class MultipleNestedTryCatch {

    
    public static void main(String[] args) {
      
        int A[] = {1,3,3,4,5};
        try{
            int c = A[0]/A[1];
            System.out.println("Quotient is "+c);
            try{
                System.out.println(A[6]);
            }
            catch(ArrayIndexOutOfBoundsException e)
              {
            System.out.println("Error is: "+e.getMessage()); 
              }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error is: "+e.getMessage());
        }
        finally{
            System.out.println("Good bye!");
        }
        
            
        
    }
    
}
