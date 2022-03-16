
package overloadednameandage;

import java.util.Scanner;

public class OverloadedNameAndAge {
    
    boolean validate(String name)
    {
        if(name == "")
        {
            return false;
        }
        for(int i =0;i<name.length();i++)
        {
            
            if(name.charAt(i)== '@' || name.charAt(i)== '/' || name.charAt(i)== '.' || name.charAt(i) == ',' || name.charAt(i) == ';')
            {
                return false;
                
            }
        }
        return true;
    }
    boolean validate(int age)
    {
        if(age > 2 && age <16 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverloadedNameAndAge chk = new OverloadedNameAndAge();
        System.out.println("Please enter choice:\n1. Validate Name\n2. Validate age to take admission in kinderGarden");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 -> {
                System.out.print("Enter name: ");
                String name;
                name = sc.nextLine();
                boolean condition = chk.validate(name);
                if (condition)
                {
                    System.out.println("Your name is valid!");
                }
                else
                {
                    System.out.println("Your name is invalid!");
                }
            }
            case 2 -> {
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                boolean condition = chk.validate(age);
                if(condition)
                {
                    System.out.println("Your age is valid!");
                }
                else
                {
                    System.out.println("Your age is invalid!");
                }        
            }
            default -> System.out.println("Please enter valid choice!");
        }
    }   
    
}
