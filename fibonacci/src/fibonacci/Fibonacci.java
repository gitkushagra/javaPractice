
package fibonacci;

import java.util.Scanner;



public class Fibonacci {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input number of terms: ");
       int terms = sc.nextInt();
       if(terms == 0)
       {
           System.out.print("Input range from 1.");
         
       }
       else if(terms == 1)
       {
           System.out.print("1\n");
       }
       else if(terms == 2)
       {
           System.out.print("1 1\n");
       }
       else
       {
           int series = 1;
           int retrieve = 1;
           System.out.print("1 1 ");
           for(int i = 1;i<terms;i++)
           {
               int temp = series;
               series += retrieve;
               retrieve = temp;
               System.out.print(series+" ");
           }
       }
    }
    
}
