import java.util.Scanner;

public class triangle_type {
    public static void main(String[] args) {
       int a=78,b=66,c=78;
        if (a==b && a==c) {
            System.out.println("This is equi");
        } else if (a==b||a==c||b==c) {
            System.out.println("This is isosceles");
        } else if ((a!=b && a!=c && b!=c)) {
            System.out.println("This is Scalene");
        }
        }

}
