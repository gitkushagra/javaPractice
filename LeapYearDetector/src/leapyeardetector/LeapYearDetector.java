
package leapyeardetector;

import java.util.Scanner;

public class LeapYearDetector {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Input Year: ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year%100 != 0) || year%400 == 0)
        {
            System.out.println(year+" is a leap year!");
        }
        else
        {
            System.out.println(year+" is not a leap year!");
        }
    }
    
}
