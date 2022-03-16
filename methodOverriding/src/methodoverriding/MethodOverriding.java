
package methodoverriding;

class sup
{
    public void display()
    {
        System.out.println("This is super class.");
    }
}

class child extends sup
{
    @Override
    public void display() // Overriding achieved
    {
        System.out.println("This is child class.");
    }
}


public class MethodOverriding {

    public static void main(String[] args) {
        sup s = new sup(); // Method for super
        s.display();
        child c = new child(); // Method for child
        c.display();
        sup test = new child();
        test.display(); // Dynamic Method Dispatch
    }
    
}
