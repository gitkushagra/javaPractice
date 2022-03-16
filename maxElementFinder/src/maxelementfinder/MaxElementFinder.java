
package maxelementfinder;

import java.util.Scanner;

public class MaxElementFinder {

    int maxFinder(int arr[])
    {
        int element = 0;
         for(int x:arr)
        {
           if (x > element)
           {
               element = x;
           }
        }
         return element;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxElementFinder max = new MaxElementFinder();
        System.out.print("Enter length of array: ");
        int length = sc.nextInt();
        int user[] = new int[length];
        int temp;
        for(int i =0;i<user.length;i++)
        {
            System.out.print("Enter "+(i+1)+" element: ");
            temp = sc.nextInt();
            user[i] = temp;
        }
        System.out.print("Your array is: ");
     
        for(int x:user)
        {
            System.out.print(x+" ");
        }
        System.out.print("\n");
        System.out.println("The maximum element is: "+max.maxFinder(user));
        
    }
    
}
