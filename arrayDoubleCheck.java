import java.lang.*;

class arrayDoubleCheck {
    public static void main(String args[]) {
      System.out.println("Submitted by Kushagra Singh (19GCEBIT098)");
      int [] arr = new int [] {20,40,60,120,80,4,2,45,90,180,60,120,31,25,78,8,32,64,87,0,31,22};
      int count = 0;
      for(int i = 0; i<arr.length; i++)
      {
          for(int j = 0;j<arr.length;j++)
          {
              if(arr[j] == 0)
              {
                  continue;
              }
              else if(arr[i]/arr[j] == 2)
              {
                  System.out.print("("+i+","+j+"),");
                  count++;
              }
              else
               {
                 continue;
               }
          }
      }
      System.out.print("\nNumber of such combinations obtained are "+count+".");
    }
}