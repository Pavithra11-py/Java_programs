package feb_7_tasks;
import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number!");
        int n= sc.nextInt();
        boolean flag=false;
        if(n==0||n==1){  flag=true;  }
        for(int i=2;i<=n/2;i++) {
            if(n%i==0){
                flag = true;
               break;
            }
        }
            if(!flag){
                System.out.println("This is a prime number!");
            }
            else{
                System.out.println("This is not a prime number!");
            }

    }
}
