
package rectangleclass;

class Rectangle
{
    public double length;
    private double breadth;
    public void setBreadth(double b)
    {
        if(b>0)
            breadth = b;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public Rectangle(double l,double b)
    {
        if (l>0)
            length = l;
        setBreadth(b);
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimetre()
    {
        return 2*(length+breadth);
    }
}

public class RectangleClass {

   
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle(10,5);
        
        Rectangle re2 = new Rectangle(15.2,10);
        
        System.out.println("The area of first rectangle is: "+re1.area());
        System.out.println("The perimetre of first rectangle is: "+re1.perimetre());
        
        System.out.println("The area of second rectangle is: "+re2.area());
        System.out.println("The perimetre of second rectangle is: "+re2.perimetre());
        
    }
    
}
