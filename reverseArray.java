import java.lang.*;
import java.util.*;

public class reverseArray {  
    public static void main(String[] args) {  
        System.out.println("Submitted By: Kushagra Singh (19GCEBIT098)");
        int [] arr = new int [] {35, 28, 34, 74, 105};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");   
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  

                 