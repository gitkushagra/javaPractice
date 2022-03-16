
package swaptwonumbers;
import java.util.Scanner;
public class SwapTwoNumbers {

    public static void main(String[] args) {
       int a,b;
       System.out.println("Enter Two Numbers: ");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
       System.out.println("Entered Numbers are: "+a+" "+b);
       a = a^b;
       b = a^b;
       a = a^b;
       System.out.println("Swapped Numbers are: "+a+" "+b);
    }
    
}
