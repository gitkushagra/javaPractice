
package inheritancerectangale;

class rectangle
{
    public double length;
    public double breadth;
    
    rectangle()
    {
        length = breadth=1;
    }
    rectangle(double length,double breadth)
    {
        if (length <0 || breadth <0)
        {
            this.length=this.breadth=1;
        }
        else
        {
            this.length=length;
            this.breadth=breadth;
        }
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

class cuboid extends rectangle
{
    public double height;
    cuboid()
    {
        height = 1;
    }
    cuboid(double length,double breadth,double height)
    {
        super(length,breadth);
        this.height=height;
    }
    public double volume()
    {
        return length*breadth*height;
    } 
    
}

public class InheritanceRectangale {

   
    public static void main(String[] args) {
        rectangle re1 = new rectangle(10,20.1);
        
        cuboid c1 = new cuboid(10,20,30.4);
        
        System.out.println("The area of rectangle is: "+re1.area());
        System.out.println("The perimetre of rectangle is: "+re1.perimetre());
         System.out.println("The volume of cuboid is: "+c1.volume());
    }
    
}
