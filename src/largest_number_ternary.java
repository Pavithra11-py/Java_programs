
import java.util.Scanner;
public class largest_number_ternary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        String greater= ((num1>num2) ? "greater number is "+num1  : ((num2>num3)? "greater number is "+num2 : "greater number is "+num3));
        System.out.println(greater);
    }
}
