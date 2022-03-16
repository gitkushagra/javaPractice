
package cylinderclass;

class cylinder
{
    public double radius;
    private double height;
    
    public void setHeight(double h)
    {
        if (h>0)
            height = h;
    }
    public double getHeight()
    {
        return height;
    }
    public cylinder()
    {
        radius = 0;
        height = 0;
    }
    public cylinder(double r,double h)
    {
        if (r>0)
            radius = r;
        setHeight(h);
    }
    
    public double lidArea()
    {
        return 2*(Math.PI*radius*radius);
    }
    public double totalSurfaceArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}

public class CylinderClass {

    
    public static void main(String[] args) {
        
       cylinder c1 = new cylinder(25,20);
       double lidarea,tsa,vol;
       cylinder c2 = new cylinder();
       c2.radius = 35.2;
       c2.setHeight(25);
       lidarea = c2.lidArea();
       tsa = c2.totalSurfaceArea();
       vol = c2.volume();
       
       
       System.out.println("The lid area of first cylinder is "+c1.lidArea());
       System.out.println("The total surface area of first cylinder is "+c1.totalSurfaceArea());
       System.out.println("The volume of first cylinder is "+c1.volume());
       
       System.out.println("The lid area of second cylinder is "+lidarea);
       System.out.println("The total surface area of second cylinder is "+tsa);
       System.out.println("The volume of second cylinder is "+vol);
    }
    
}
