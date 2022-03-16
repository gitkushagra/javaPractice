
package displaydigits;

import java.util.Scanner;
public class DisplayDigits {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num = sc.nextInt();
       int digit;
       while (num>0)
       {
           digit = num%10;
           System.out.println(digit);
           num /= 10;
       }
       
       
    }
    
}
