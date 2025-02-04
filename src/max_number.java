import java.util.Scanner;
public class max_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any two numbers");
        int a=sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.printf("%d is greater",a);
        }
        else
        {
            System.out.printf("%d is greater",b);
        }
    }
}
