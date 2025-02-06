import java.util.Scanner;
public class largest_three_num {
    public static void main(String[] args) {
       int a=65, b=56,c=33;;
        int large = Math.max(Math.max(a,b),c);
        System.out.println("largest is "+large);
//        if ( a > b && a>c){
//            System.out.printf("%d is largest",a);
//        } else if (b>c) {
//            System.out.printf("%d is largest",b);
//        }
//        else {
//            System.out.printf("%d is largest",c);
//        }
    }
}
