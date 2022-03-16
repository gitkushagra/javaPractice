
package regularexpression;

public class RegularExpression {

    public static void main(String[] args) {
        
        //Matching Symbols
        String str1 = "f";
        String str2 = "ab";
        System.out.println(str1.matches(".")); //true
        System.out.println(str2.matches(".")); //false
        String str3 = "ab";
        String str4 = "b";
        System.out.println(str3.matches("[abc]")); //false
        System.out.println(str4.matches("[abc]")); //true
        String str5 = "x";
        System.out.println(str5.matches("[a-z1-9]")); //true
        String str6 = "x1";
        System.out.println(str6.matches("[a-z1-9]")); //false
        System.out.println(str6.matches("[a-z][1-9]")); //true
        String str7 = "abc";
        System.out.println(str7.matches("ab")); //false
        System.out.println(str7.matches("abc")); //true
        
        
        // Meta Character
        
        String str8 = "abc";
        System.out.println(str8.matches("\\w")); //false
        System.out.println(str8.matches("\\w\\w\\w")); //false
        
        
        // Quantifiers
        
        String str9 = "aabbccaaccbb";
        System.out.println(str9.matches(".*")); // any character 0 or more times true
        System.out.println(str9.matches(".+")); // 1 or more true
        String str10 = "acb";
        System.out.println(str9.matches("[abc]{3}"));
        System.out.println(str10.matches("[abc]{3}"));//abc acb bac.. with exactly 3 characters
        System.out.println(str9.matches("[abc]{3,7}"));
        
    }
    
}
