import java.util.Scanner;
public class atm_withdrawal {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter amount to Withdraw!");
        int amount = sc.nextInt();
        if(amount >0 && amount <=balance && amount%100==0){
            int  updated_balance = balance-amount;
            System.out.printf("Updated balance is %d ",updated_balance);
        } else if (amount>balance) {
            System.out.println("This exceeds your current balance.Please check your balance");

        } else if(amount<=0){
            System.out.println("Please enter valid amount");
        }
        else if (amount%100!=0){
            System.out.println("Please enter amount in multiples of 100");
        }
        else{
            System.out.println("Withdrawal Failed! Please try again");
        }
    }
}
