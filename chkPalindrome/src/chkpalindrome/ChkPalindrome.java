
package chkpalindrome;
import java.util.*;

public class ChkPalindrome {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input number: ");
       String num = sc.next();
       String revnum = "";
       int length = num.length();
       for(int i = length-1;i>=0;i--)
       {
           revnum += num.charAt(i);
       }
       if(Integer.parseInt(num) == Integer.parseInt(revnum))
       {
           System.out.println("The number is palindrome.");
       }
       else
       {
           System.out.println("The number is not palindrome.");
       }
    }
    
}
