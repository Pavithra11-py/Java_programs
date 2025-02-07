import java.util.Scanner;
public class Palindrome_ornot {
    public static void main(String[] args) {
       int n, reverse=0,rem,original;
        System.out.println("Enter an integer: ");
        Scanner  s= new Scanner(System.in);
        n=s.nextInt();
        original = n;

        // reversed integer is stored in reversed variable
        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        // palindrome if orignal and reversed are equal
        if (original == reverse)
            System.out.printf("%d is a palindrome.", original);
        else
            System.out.printf("%d is not a palindrome.", original);


    }
}
