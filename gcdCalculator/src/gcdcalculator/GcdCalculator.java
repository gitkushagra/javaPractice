
package gcdcalculator;

import java.util.Scanner;

public class GcdCalculator {

    static int gcdCalc(int num1,int num2)
    {
        boolean condition = true;
        while(condition)
        {
            if(num1 > num2)
            {
                num1 -= num2;
            }
            else if(num2>num1)
            {
                num2 -= num1;
            }
            else if(num1==num2)
            {
                condition = false;
            }
        }
        
        return num1;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        int hcf = gcdCalc(num1,num2);
        System.out.println("The GCD or HCF of "+num1+" and "+num2+" is: "+hcf);
    }
    
}
