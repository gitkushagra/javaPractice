
package arrayproject;

import java.util.Scanner;
public class ArrayProject {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        int input;
        System.out.print("Input Values:\n");
        for(int i = 0;i<arr.length;i++)
        {
            input = sc.nextInt();
            arr[i] = input;
        }
        System.out.println("Input choice:\n1. Sum of elements.\n2. To search an element.\n3. To find maximum element.\n4. To find second largest element.");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: int sum = 0;
                    for(int j = 0;j<arr.length;j++)
                    {
                        sum += arr[j];
                    }
                    System.out.println("The sum is: "+sum);
                    break;
            case 2: System.out.print("Input element to be searched: ");
                    int element = sc.nextInt();
                    System.out.println("If BLANK after successful execution, the element is NOT FOUND!");
                    for(int j = 0;j<arr.length;j++)
                    {
                        if(arr[j] == element)
                        {
                            System.out.println("Found at index: "+j);
                            
                        }
                    }
                    System.out.println("Successfully executed!");
                    break;
            case 3: int highest = 0;
                    for(int j = 0;j<arr.length;j++)
                    {
                        if(arr[j] > highest)
                        {
                            highest = arr[j];
                        }
                    }
                    System.out.println("The HIGHEST element is: "+highest);
                    break;
            case 4: highest = arr[0];
                    int secondHighest = arr[0];
                    for(int j = 0;j<arr.length;j++)
                    {
                     if(arr[j] > highest)
                     {
                         secondHighest = highest;
                         highest = arr[j];
                     }
                     else if(arr[j] > secondHighest)
                     {
                         secondHighest = arr[j];
                     }
                    }
                    System.out.println("The SECOND HIGHEST element is: "+secondHighest);
                    break;
            default : System.out.println("Please input valid choice!");
                    
        }
    }
    
}
