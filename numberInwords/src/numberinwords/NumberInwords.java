
package numberinwords;

import java.util.Scanner;

public class NumberInwords {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        String num = sc.next();
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int length = num.length();
        for(int i = 0;i<length;i++)
        {
            int index = Integer.parseInt(String.valueOf(num.charAt(i)));
            System.out.print(arr[index]+" ");
        }
        System.out.print("\n");
    }
    
}
