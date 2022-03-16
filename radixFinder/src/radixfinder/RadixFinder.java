
package radixfinder;

import java.util.Scanner;
public class RadixFinder {

 
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number to find RADIX: ");
        String num = sc.next();
        if(num.matches("[01]+"))
        {
            System.out.println("Binary");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal");
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Hexadecimal");
        }
    }
    
}
