
package arrayhighest;

public class ArrayHighest {

    public static void main(String[] args) {
        
        //int arr[] = {1,25,65,15,14,7,8,11,0,1,85,35,22,1,0,1,99};
        int arr[] = {2,5,8,4,7,2,3,0,14,4};
        int element,highest = 0;
        for(int i = 0;i<arr.length;i++)
        {
            element = arr[i];
            if (element > highest)
            {
                highest = element;
            }
        }
        System.out.println(highest);
       
        /*int heighest,pointer1 = 0,pointer2 = 1;
        for(int i = 0;i<arr.length;i++)
        {
        if (arr[pointer1] > arr[pointer2])
                {
                     pointer2++;
                }
        else if(arr[pointer2] > arr[pointer1])
                {
                    pointer1 = pointer2;
                    System.out.println(pointer1);
                }
       else
                {
                    pointer2++ ; 
                }
        }
        heighest = arr[pointer1];
        System.out.println(heighest);  
        */
       
    }
}
