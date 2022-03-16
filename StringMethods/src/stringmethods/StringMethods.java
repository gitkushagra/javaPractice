
package stringmethods;

public class StringMethods {

    public static void main(String[] args) {
        
        // Practice 1
        System.out.println("Practice1");
        System.out.printf("\n");
        String str = new String("    netbeans    ");
        System.out.println(str.length()); // Length of string
        //str.toUpperCase(); lost because new string is not assigned
        str =str.toUpperCase(); //captilise
        System.out.println(str); 
        str = str.trim(); // trims leading and trailing spaces
        System.out.println(str);
        String str1 =str.substring(2);// prints str from index 2 till last
        System.out.println(str1);
        str1 = str.substring(2,6); // overloaded method, prints str from index 2 to (6-1)th index
        System.out.println(str1);
        String str2 = str.replace("E", "M"); // It replaces all E with M in str
        System.out.println(str2);
        
        
        // Practice 2
        System.out.printf("\n");
        System.out.println("Practice2");
        System.out.printf("\n");
        
        String name = "Mr. Sarukh Khan";
        System.out.println(name.startsWith("Mr.")); // Return true or false if Mr. exist in name or not
        System.out.println(name.startsWith("r."));
        System.out.println(name.startsWith("shah",4)); //  starts checking from index 4
        System.out.println(name.endsWith("han"));
        
        System.out.println(name.charAt(4)); // Returns a charater at given index
        for(int i=0;i<name.length();i++)
        {
            System.out.print(name.charAt(i));
        }
        System.out.printf("\n");
        System.out.println("Index of 'r' is: "+name.indexOf("r")); // returns index of given character in name
        System.out.println("Index of 'r' from index 3 is: "+name.indexOf("r",3)); // starts searching r from index 3 in name
        
        // Practice 3
        System.out.printf("\n");
        System.out.println("Practice3");
        System.out.printf("\n");
        
        String s1 = "Pyramid";
        String s2 = "Pyramid";
        String s3 = new String("Pyramid");
        System.out.println(s1.equals(s2)); // Checks if each character in s1 is same as s2 and returns boolean
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);// both s1 and s2 points to same string "Pyramid" in string pool
        System.out.println(s1==s3); // s3 is created as reference to "Pyramid" object in heap, yes "Pyramid" already exist in pool, but s3 is not refrenced to it hence false
        String s4 = "China call";
        String s5 = new String("China Pyramid");
        System.out.println(s4.compareTo(s5)); // retruns ASCII diffrence of first charactes (from where they are different) i.e. between c (index 6) of s4 and P (index 6) of s5 is 99-80=19
        System.out.println(s5.compareTo(s4)); // In this case 80-99=-19
        System.out.println(s4.compareToIgnoreCase(s5)); // Do same as compareTo() but it takes capital letters ASCII only i.e. C(ASCII)-P(ASCII)=67-80=-13
        System.out.println(s4.contains("a")); //checks given string "a" in string s4 and returns boolean
        System.out.println(s4.concat(s5)); // It simply concatinates two strings  
    }
    
}
