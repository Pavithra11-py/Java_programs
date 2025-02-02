import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number 1");
        int num1= sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        {
          String result  = (num1>num2) ? "num1 is greater" :"num2 is greater";
            System.out.println(result);
        }

    }

}
