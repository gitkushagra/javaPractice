
package armstrong_number;
import java.util.Scanner;

public class Armstrong_number {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input number: ");
       int num = sc.nextInt();
       int store = num;
       int length = (String.valueOf(num)).length();
       int sum = 0,digit;
       for(int i = 0;i<length;i++)
       {
           digit = num%10;
           sum += Math.pow(digit,length);
           num /= 10;
       }
       if(store == sum)
       {
           System.out.println("The number is Armstrong.");
       }
       else
       {
           System.out.println("The number is not Armstrong.");
       }
    }
    
}
