import java.util.Scanner;
public class sal_bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bonus=0;
        System.out.println("Enter your salary!");
        double sal=sc.nextDouble();
        System.out.println("enter years of experience..");
        int exp = sc.nextInt();
        if(exp ==1){
            System.out.println("No bonus");;}
        else if (exp >= 1 && exp<=3) {
            bonus = 5;
        }else if(exp >=4 && exp <= 6) {
            bonus = 10;
        }else {
            bonus = 15;
        }
        double bonusAmount = sal * bonus/100;
        System.out.printf("your bonus is %f",bonusAmount);
    }
}
