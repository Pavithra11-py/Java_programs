package feb_7_tasks;
import java.util.Scanner;
public class multiplication_table_of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number!");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println("");
        }


    }
}
