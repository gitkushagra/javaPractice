
package tablemultiplication;

import java.util.Scanner;

public class Tablemultiplication {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of which table needs to be described: ");
        int n = sc.nextInt();
        System.out.println("Enter limit in positive integer: ");
        int limit = sc.nextInt();
        for(int i = 0;i<=limit;i++)
        {
            System.out.printf("%d x %d = %d\n" , n,i,(n*i));
        }
    }
    
}
