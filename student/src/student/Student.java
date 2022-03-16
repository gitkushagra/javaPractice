
package student;

import java.util.*;

class abschool
{
    private String rollNo;
    private static int count = 1;
    
    private String generateRollNo()
    {
        Date d = new Date();
        String rollnum = "Univ-"+(d.getYear()+1900)+"-"+count++;
        return rollnum;
    }
    abschool()
    {
        rollNo = generateRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
}
public class Student {

    
    public static void main(String[] args) {
       
        abschool s1 = new abschool();
        abschool s2 = new abschool();
        abschool s3 = new abschool();
        abschool s4 = new abschool();
        
        System.out.println(s1.getRollNo());
         System.out.println(s2.getRollNo());
          System.out.println(s3.getRollNo());
           System.out.println(s4.getRollNo());
    }
    
}
