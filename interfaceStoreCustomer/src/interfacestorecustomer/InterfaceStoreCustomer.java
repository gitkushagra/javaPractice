
package interfacestorecustomer;

interface Member
{
    void callBack();
}

class Store
{
    Member mem[] = new Member[100];
    int count = 0;
    
    public void register(Member m)
    {
        mem[count++] = m;
    }
    public void inviteSale()
    {
        for(int i = 0;i<count;i++)
        {
            mem[i].callBack();
        }
    }
    
}

class customer implements Member
{
    String name;
    customer(String n)
    {
        name=n;
    }
    @Override
    public void callBack()
    {
        System.out.println("Ok! I will visit, "+name);
    }
}

public class InterfaceStoreCustomer {  
    public static void main(String[] args) {
      Store s = new Store();
      customer c1 = new customer("Jhon");
      customer c2 = new customer("Smith");
      customer c3 = new customer("Bob");
      customer c4 = new customer("Harsh");
      s.register(c1);
      s.register(c2);
      s.register(c3);
      s.register(c4);
      s.inviteSale();
      
    }
    
}
