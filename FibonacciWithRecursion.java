import java.lang.*;
import java.util.*;

class FibonacciWithRecursion
      {  
         static int num1=0,num2=1,num3=0;    
          static void Fibonacci(int x)
                {    
                  if(x>0)
                    {    
                      num3 = num1 + num2;    
                      num1 = num2;    
                      num2 = num3;    
                      System.out.print(" "+num3);   
                      Fibonacci(x-1);    
     }    
 }    
      public static void main(String args[])
         {
      System.out.println("Submitted By: Kushagra Singh (19GCEBIT098)");    
      int x;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enput range in positive number: "); 
      x = sc.nextInt(); 
      System.out.print(num1+" "+num2);//printing 0 and 1    
      Fibonacci(x-2);//n-2 because 2 numbers are already printed   
 }  
}  
            
 
                      


                        
                         