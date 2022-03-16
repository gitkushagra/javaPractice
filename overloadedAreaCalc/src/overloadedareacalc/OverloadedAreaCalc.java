
package overloadedareacalc;

import java.util.Scanner;

public class OverloadedAreaCalc {

    float area(float length,float breadth)
    {
        return length*breadth;
    }
    double area(float side1,float side2,float side3)
    {
        float semiperimeter = (side1+side2+side3)/2;
        return Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
    }
    double area(float radius)
    {
        return Math.PI*Math.pow(radius, 2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverloadedAreaCalc link = new OverloadedAreaCalc();
        System.out.print("Choose from following to find area for: \n1. Rectangle/Square \n2. Triangle\n3. Circle\n");
        int choice = sc.nextInt();
        float length,breadth,radius;
        switch(choice)
        {
            
            
            case 1: System.out.print("Enter length: ");
                    length = sc.nextFloat();
                    System.out.print("Enter breadth: ");
                    breadth = sc.nextFloat();
                    System.out.println("The area is: "+link.area(length, breadth));
                    break;
            case 2: System.out.println("Enter sides:");
                    System.out.println("Enter first side:");
                    length = sc.nextFloat();
                    System.out.println("Enter second side:");
                    breadth = sc.nextFloat();
                    System.out.println("Enter third side:");
                    radius = sc.nextFloat();
                    System.out.printf("The area is: %.2f\n",link.area(length,breadth,radius));
                    break;
                   
            case 3: System.out.print("Enter radius: ");
                    radius = sc.nextFloat();
                    System.out.printf("The area is: %.2f \n",link.area(radius));
                    break;
            default: System.out.println("Please enter valid choice!");
                   
        }
    }
    
}
