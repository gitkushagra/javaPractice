/* Inner anonymous classes are  helpful 
in abstract classes
*/
package anonymousinnerclass;

abstract class neo
{
    abstract void display();
}

class d
{
    public void method()
    {
        neo n = new neo()
        {
            @Override
            public void display()
            {
                System.out.println("Test successful");
            }
        };
        n.display();
        
    }
}

public class AnonymousInnerClass {

    
    public static void main(String[] args) {
        d obj = new d();
        obj.method();
    }
    
}
