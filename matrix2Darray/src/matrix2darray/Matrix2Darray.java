
package matrix2darray;

import java.util.Scanner;

public class Matrix2Darray {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input number of rows: ");
      int rows = sc.nextInt();
      System.out.print("Input number of columns: ");
      int columns = sc.nextInt();
      int A[][] = new int[rows][columns];
      int B[][] = new int[rows][columns];
      int operation[][] = new int[rows][columns];
      int value;
      for(int i = 0;i<A.length;i++)
      {
          for(int j = 0;j<A[i].length;j++)
          {
              System.out.print("Enter "+j+"th value: ");
              value = sc.nextInt();
              A[i][j] = value;
          }
      }
       for(int i = 0;i<B.length;i++)
      {
          for(int j = 0;j<B[i].length;j++)
          {
              System.out.print("Enter "+j+"th value: ");
              value = sc.nextInt();
              B[i][j] = value;
          }
      }
      System.out.print("Select from following: 1. ADD\n2. MULTIPLY\n");
      int choice = sc.nextInt();
      switch(choice)
      {
          case 1 : for(int i = 0;i<A.length;i++)
                   {
                       for(int j=0;j<A[i].length;j++)
                       {
                           operation[i][j] = A[i][j]+B[i][j];
                           
                       }
                   }
                   for(int x[]: operation)
                   {
                       for(int y:x)
                       {
                           System.out.printf("%02d ",y);
                       }
                       System.out.print("\n");
                   }
                   break;
            default: System.out.print("Please enter valid choice!");
                   
      }
    }
    
}
