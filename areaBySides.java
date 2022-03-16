import java.util.Scanner;
class areaBySides {
    public static void main(String args[])
    {
         System.out.println("Welcome to triangle area calculator!");
        double a;
        double b;
        double c;
        double sum;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sides: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        sum = (a+b+c)/2d;
        result = Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
        System.out.println("Area of triangle is : "+result);
    }
}