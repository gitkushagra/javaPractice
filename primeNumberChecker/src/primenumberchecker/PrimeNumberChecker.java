
package primenumberchecker;

import java.util.Scanner;

public class PrimeNumberChecker {

    static boolean check(int num)
    {
        boolean button = true;
        while (button)
                {
               for(int i = 2;i<=Math.sqrt(num);i++)
                  {
                   if(num % i == 0)
                     {
                     return false;
                     }
                  }
                  button = false;
                }
                
                return true;
       
    }
   
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a positive number to check: ");
           int num = sc.nextInt();
           boolean result = check(num);
           if(result)
           {
               System.out.println(num+" is a prime number.");
           }
           else
           {
                System.out.println(num+" is NOT a prime number.");
           }
    }
    
}
