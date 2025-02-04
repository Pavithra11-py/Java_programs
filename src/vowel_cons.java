import java.util.Scanner;
public class vowel_cons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any character");
        char ch= sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.printf("%c is a Vowel",ch);
        }
        else{
            System.out.printf("%c is a Consonent",ch);
        }
    }
}
