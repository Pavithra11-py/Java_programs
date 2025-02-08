import java.util.Scanner;
public class electricity_bill_cons {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter units!");
        int unit=s.nextInt();
        if (unit>=0 || unit<=100){
            Double units=unit*0.05;
            System.out.printf("Electricity bill is %f rs",units);
        } else if (unit>100 && unit<=200) {
            Double units=unit*0.75;
            System.out.printf("Electricity bill is %f rs",units);
        }else if (unit>200 && unit<=300) {
            Double units=unit*1.20;
            System.out.printf("Electricity bill is %f rs",units);
        } else if (unit>300) {
            Double units=unit*1.50;
            System.out.printf("Electricity bill is %f rs",units);
        }
    }
}
