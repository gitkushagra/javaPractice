
package reversenumber;

import java.util.Scanner;
public class ReverseNumber {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        String num = sc.next();
        int length = num.length();
        
        for(int i = length-1;i>=0;i--)
        {
             System.out.print(num.charAt(i)+" ");
        }
        System.out.print("\n");
           
        
    }
    
}
