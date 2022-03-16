
package abstractshape;

abstract class shape
{
 
    abstract public double area();
    abstract public double perimetre();
}

class rectangle extends shape
{
      double length;
      double breadth;
      rectangle()
      {
          length = breadth = 1;
      }
      rectangle(double length,double breadth)
      {
          if (length <0 || breadth <0)
          {
              this.length = this.breadth = 1;
          }
          else
          {
              this.length = length;
              this.breadth=breadth;
          }  
      }
        @Override
        public double area()
          {
              return length*breadth;
          }
        @Override
          public double perimetre()
          {
              return 2*(length+breadth);
          }
}

class cuboid extends rectangle
{
    double height;
    cuboid()
    {
        height = 1;
    }
    cuboid(double length,double breadth,double height)
    {
        super(length,breadth);
        if (height < 0)
        {
            height = 1;
        }
        else
        {
            this.height=height;
        }
    }
    public double volume()
    {
        return length*breadth*height;
    }
}

public class AbstractShape {

    
    public static void main(String[] args) {
        shape r = new rectangle(10,30);
        
        cuboid c = new cuboid(10,20,30.1);
        
        
        System.out.println("The area of rectangle is: "+r.area());
        System.out.println("The perimetre of rectangle is: "+r.perimetre());
        
        System.out.println("The volume of cuboid is "+c.volume());
                
    }
    
}
