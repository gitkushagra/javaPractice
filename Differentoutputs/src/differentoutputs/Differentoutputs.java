
package differentoutputs;


public class Differentoutputs {

  
    public static void main(String[] args) {
        int x= 10,y=20,a=-10;
        float z = 0.0025f;
        System.out.printf("%3$d %2$d %1$.3f\n",z,y,x); // defines position of variable of certain type after ,
        System.out.format("%3$d %2$d %1$.3f\n",z,y,x); // same
        System.out.printf("%o %x\n",x,x); // prints x in octal & hexa-decimsl
        System.out.printf("%6d\n", x); // consumes 6 places in output
        System.out.printf("%06d\n", x); // using flag 0, replace all blanks with 0s
        System.out.printf("%(6d\n", a); // using flag (, put number in brackets if it is negative instead of - symbol
        
        System.out.printf("\n\n");
        // Working on strings
        
        String str1 = "Java Program"; // created in pool
        String str2 = "Java Program"; // created in pool
        String str3 = new String("Java Program"); // created in heap
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        char as[] = {'H','e','l','l','o'};
        String str4 = new String(as); // created in heap in which str4 is pointing and also created in pool but with no reference
        System.out.println(str4);
        byte as2[] = {65,66,67,68};
        String str5 = new String(as2); // treats as2 as ASCII characters i.e. 65=A,66=B...
        System.out.println(str5);
        String str6 = new String(as,2,2);
        System.out.println(str6);
    }   
    
}
