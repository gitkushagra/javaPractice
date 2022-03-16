import java.lang.*;
import java.util.*;

class FibonacciWithoutRecursion
       {
          public static void main(String arg[])
               {
                  System.out.println("Submitted By: Kushagra Singh (19GCEBIT098)");
                  int num1 = 0;
                  int num2 = 1;
                  int next = num1+num2;
                  int num;
                  Scanner s = new Scanner(System.in);
                  System.out.println("Enter range in positive integer: ");
                  num = s.nextInt();
                  if(num == 1)
                    {
                      System.out.println("Fibonacci series is : "+num1);
                    }
                   else if(num == 2)
                    {
                      System.out.println("Fibonacci series is: "+num1+" "+num2);
                    }
                   else if(num>=3)            
                    {
                      System.out.println("Fibonacci series is : ");
                      System.out.println("0");
                      System.out.println("1");
                      for(int i =3; i<=num ; i++)
                       {
                          System.out.println(""+next);
                          num1 = num2;
                          num2 = next;
                          next = num1+num2;
                      }
                   }

               }
          }
                      


                        
                         