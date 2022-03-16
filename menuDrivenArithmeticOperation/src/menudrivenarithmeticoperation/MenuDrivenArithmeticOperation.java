
package menudrivenarithmeticoperation;

import java.util.Scanner;

public class MenuDrivenArithmeticOperation {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option from below: ");
        System.out.println("1. ADD\n2. SUBTRACT\n3. MULTIPLY\n4. DIVIDE\n5. MODULUS");
        
        int choice = 0;
        int num1=0, num2=0;
        if(sc.hasNextInt())
        {
            choice = sc.nextInt();
            System.out.print("Enter Num 1: ");
            if(sc.hasNextInt())
            {
                num1 = sc.nextInt();
                System.out.print("Enter Num 2: ");   
            }
            if(sc.hasNextInt())
            {
                num2 = sc.nextInt();  
            }
        }
        switch(choice)
        {
            case 1: System.out.println("Sum is: "+(num1+num2));
                    break;
            case 2: System.out.println("Difference is: "+(num1-num2));
                    break;
            case 3: System.out.println("Product is: "+(num1*num2));
                    break;
            case 4: System.out.println("Quotient is: "+(num1/num2));
                    break;
            case 5: System.out.println("Remainder is: "+(num1%num2));
                    break;
            default:System.out.println("Please enter correct choice");
            
        }
    }
    
}
