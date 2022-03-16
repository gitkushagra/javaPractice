
package apgpseries;

import java.util.Scanner;

public class ApgpSeries {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input start positive number: ");
        int startnum = sc.nextInt();
        System.out.print("Input number of terms: ");
        int terms = sc.nextInt();
        System.out.print("Input choice:\n1. AP\n2.GP\n ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Input difference: ");
                    int diff = sc.nextInt();
                    for(int i=0;i<terms;i++)
                    {
                        System.out.print(startnum+" ");
                        startnum += diff;
                    }
                    break;
            case 2: System.out.println("Input ratio: ");
                    int ratio = sc.nextInt();
                    for(int i = 1;i<=terms;i++)
                    {
                        
                        System.out.print((int)(startnum*Math.pow(ratio, i))+" ");
                        
                    }
                    break;
        }
        
    }
    
}
