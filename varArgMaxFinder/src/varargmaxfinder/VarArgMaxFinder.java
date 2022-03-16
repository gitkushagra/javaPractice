
package varargmaxfinder;


public class VarArgMaxFinder {

    int maxFinder(int...a)
    {
        
        int highest = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>highest)
            {
                highest = a[i];
            }
        }
        return highest;
        
    }
  
    public static void main(String[] args) {
        
        VarArgMaxFinder chk = new VarArgMaxFinder();
        System.out.println(chk.maxFinder(10,25,35,14,0,14,7));
        System.out.println(chk.maxFinder(5,10));
        System.out.println(chk.maxFinder(10,25,35,14,99,14,7));
      
    }
    
}
