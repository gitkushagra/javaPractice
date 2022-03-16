
package sum_of_n_numbers;

import java.util.*;
public class Sum_of_n_numbers {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input limit upto which sum needs to be found: ");
       int limit = sc.nextInt();
       int sum = 0;
       for(int i = 0;i<=limit;i++)
       {
           sum += i;
       }
       System.out.print("The sum is: "+sum+"\n");
    }
    
}
