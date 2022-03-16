import java.lang.*;
import java.util.*;

class rootFinder
     {
        public static void main(String args[])
             {
               int a,b,c;
               double r1,r2;
               Scanner sc = new Scanner(System.in);
               System.out.println("Input cofficients: ");
               a = sc.nextInt();
               b = sc.nextInt();
               c = sc.nextInt();
               System.out.println("Quadratic equation is as: "+a+"x^2+"+b+"x+"+c);
               if((b*b-4*a*c)<0)
                  {
                     System.out.println("Inputs are invalid!");
                  }
               else
                  {
                     r1 = (b + Math.sqrt(b*b-4*a*c))/(2*a);
                     r2 = (b - Math.sqrt(b*b-4*a*c))/(2*a);
                     System.out.println("Square roots are: "+r1+","+r2);
                  }
             }
        }