import java.util.Scanner;
public class travel_visa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age!");
        int age=s.nextInt();
        System.out.println("Enter visa status!");
        boolean status= s.nextBoolean();
        if(age>=18 && status==true){
            System.out.println("Eligible to travel");
        }
        else{
            System.out.println("Not Eligible to travel");
        }
    }
}
