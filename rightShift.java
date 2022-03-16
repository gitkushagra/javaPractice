import java.lang.*;
import java.util.*;

class rightShift
     {
        public static void main(String args[])
             {
               int a,b;
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter integer: ");
               a = sc.nextInt();
               System.out.println(a);
               System.out.println(Integer.toBinaryString(a));
               b = a>>1;
               System.out.println(b);
               System.out.println(Integer.toBinaryString(b));
               
             }
     }