import java.util.Scanner;
public class loan_eligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age! ");
        int age= sc.nextInt();
        System.out.println("Enter your salary!");
        double sal=sc.nextDouble();
        System.out.println("Enter our credit score!");
        int credit_score = sc.nextInt();
        int minage =18,maxage=60,mincre_score=650,maxcred_score=850;
        Double minsal= 30000.0;
        if (age>=minage && age<=maxage && sal>=minsal && credit_score>=mincre_score && credit_score<= maxcred_score)
        {
            System.out.println("You are eligible to vote...");
        }
        else{
            System.out.println("You are not eligible to vote...");
        }

    }
}
