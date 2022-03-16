
package innerclasses;

class outer
{
    int x = 10;
    static int y = 20;
    
    class Inner
    {
        int z = 30;
        public void displayatinner()
        {
            System.out.println("The value of x is "+x);
            System.out.println("The value of y is "+y);
            System.out.println("The value of z is "+z);
        }
    }
    public void displayatouter()
    {
        Inner obj = new Inner();
        
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
        System.out.println("The value of z is "+obj.z);
    }
}

public class InnerClasses {

    
    public static void main(String[] args) {
        outer out = new outer();
        out.displayatouter();
        outer.Inner inn = new outer().new Inner();
        inn.displayatinner();
    }
    
}
