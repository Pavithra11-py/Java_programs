import java.util.Scanner;
public class armstrong_ornot {
    public static void main(String[] args) {
        int num, originalNum, remainder, result = 0;
        System.out.println("Enter a three-digit integer: ");
        Scanner s=new Scanner(System.in);
        num = s.nextInt();
        originalNum = num;

        while (originalNum != 0) {
            // remainder contains the last digit
            remainder = originalNum % 10;

            result += remainder * remainder * remainder;

            // removing last digit from the orignal number
            originalNum /= 10;
        }

        if (result == num)
            System.out.printf("%d is an Armstrong number.", num);
        else
            System.out.printf("%d is not an Armstrong number.", num);

    }
}
