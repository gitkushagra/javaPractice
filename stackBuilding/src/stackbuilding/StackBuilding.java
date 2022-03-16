
package stackbuilding;

class stackOverFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is full.";
    }
}

class stackUnderFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is empty!";
    }
}


class stackBuild
{
    final private int length;
    private int top = -1;
    final private int stack[];
    
    public stackBuild(int length)
    {
        this.length = length;
        stack = new int[length];
    }
    
    public void push(int x) throws stackOverFlowException
    {
        if (top == length-1)
        {
            throw new stackOverFlowException();
        }
        else
        {
            stack[++top] = x;
            System.out.println("Pushed: "+x);
        }
    }
    
    public int pop() throws stackUnderFlowException
    {
        if (top == -1)
        {
            throw new stackUnderFlowException();
        }
        else
        {
            return stack[top--];
        }
    }
    public void traverse() throws stackUnderFlowException
    {
        if(top == -1)
        {
            throw new stackUnderFlowException();
        }
        else
        {
            for(int i = 0;i<=top;i++)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println("\n");
        }
    }
    
}

public class StackBuilding {

   
    public static void main(String[] args) {
             stackBuild s = new stackBuild(6);
             try{
                 //s.traverse();
                 //System.out.println("Popped: "+s.pop());
                 s.push(8);
                 s.push(1);
                 s.push(3);
                 s.push(4);
                 s.push(14);
                 s.push(1);
                 s.traverse();
                 System.out.println("Popped: "+s.pop());
                 s.traverse();
                 System.out.println("Popped: "+s.pop());
                 s.traverse();
                 s.push(47);
                 s.traverse();
                 System.out.println("Popped: "+s.pop());
                 System.out.println("Popped: "+s.pop());
                 System.out.println("Popped: "+s.pop());
                 System.out.println("Popped: "+s.pop());
                 System.out.println("Popped: "+s.pop());
                 System.out.println("Popped: "+s.pop());
                 
                 
             }
             catch(stackOverFlowException e)
             {
                 System.out.println(e);
             }
             catch(stackUnderFlowException e)
             {
                 System.out.println(e);
             }
             catch(Exception e)
             {
                 System.out.println(e.getMessage());
             }
             finally
             {
                 System.out.println("Done!");
             }
             
    }
    
}
