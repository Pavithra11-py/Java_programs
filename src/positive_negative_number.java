import java.util.Scanner;

public class positive_negative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number!");
        int num= sc.nextInt();
        int result = check(num);
        if (result==0)
        {
            System.out.println("This is value 0");
        }
        else if (result==1)
        {
            System.out.println("This is a positive number");
        }
        else {
            System.out.println("This is a negative number");
        }
    }
    static int check(int y)
    {
        int x=  Integer.signum(y);
        return x;

    }
}
