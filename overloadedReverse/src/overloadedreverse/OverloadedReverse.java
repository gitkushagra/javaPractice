
package overloadedreverse;

import java.util.Scanner;

public class OverloadedReverse {

    int reverse(String num)
    {
        String temp = "";
        for(int i=num.length()-1;i>=0;i--)
        {
            temp += num.charAt(i);
        }
        return Integer.parseInt(temp);
    }
    int[] reverse(int arr[])
    {
        int temp[] = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1;i>=0;i--)
        {
            temp[index] = arr[i];
            index++;
        }
        return temp;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverloadedReverse call = new OverloadedReverse();
        System.out.println("Enter choice to reverse:\n1. Number\n2. Array");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1: String num;
                    System.out.print("Enter number: ");
                    num = sc.next();
                    System.out.format("The reversed number is: %d\n",call.reverse(num));
                    break;
            case 2: System.out.print("Enter length of the array:  ");
                    int length = sc.nextInt();
                    int arr[] = new int[length];
                    int element;
                    for(int i=0;i<length;i++)
                    {
                        System.out.printf("Enter %d element: ",i+1);
                        element = sc.nextInt();
                        arr[i] = element;
                        
                    }
                    System.out.println("The array entered by you is: ");
                    for(int i =0;i<length;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.print("\n");
                    System.out.print("Reversed array is: ");
                    int output[] = call.reverse(arr);
                    for(int i =0;i<output.length;i++)
                    {
                        System.out.print(output[i]+" ");
                    }
                     System.out.print("\n");
                    break;
            default: System.out.println("Please enter valid choice!");
                            
            
        }
        
    }
    
}
