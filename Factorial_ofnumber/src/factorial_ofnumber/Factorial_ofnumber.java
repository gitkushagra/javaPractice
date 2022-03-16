
package factorial_ofnumber;

import java.util.*;

public class Factorial_ofnumber {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input the number of which factorial needs to be found: ");
       int num = sc.nextInt();
       int factorial = num;
       if(num == 0 || num == 1)
       {
           factorial = 1;
       }
       else
       {
           for(int i = num-1;i>0;i--)
           {
               factorial *= i;
           }
       }
       System.out.println("The factorial is: "+factorial+"\n");
    }
    
}
