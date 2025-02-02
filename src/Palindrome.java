import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string :");
        String str= sc.nextLine();
        String str1 ="";
        int slength=str.length();
        for (int i=slength-1; i>=0;i--) {
            str1 += str.charAt(i);
        }
        if(str.equals(str1))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }


    }
}
