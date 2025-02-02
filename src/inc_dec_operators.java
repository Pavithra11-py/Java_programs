import java.util.Scanner;

public class inc_dec_operators {
    public static void main(String[] args) {
        int a=10;
//  increment      int b = ++a;
//        int c  = a++;
//        System.out.println(a);
//        System.out.println(b);// b=10+1=11
//        System.out.println(c); // c=10+1 = 11
//        System.out.println(a++ +a); // (12 +1) 13 + 12 == 25
        //System.out.println(a++ + ++a); // 10 and then increases to 11 + (11+1)12 ==> 10 + 12 = 22
       // System.out.println(++a + ++a);// 11 + 11+1 = 12 ==> 23
//decrement
//        int b=--a; int c  = a--;
//        System.out.println(b); //9
//        System.out.println(c); // 9-- is prints 9 thenafter it stores value as 8
       // int b  = a-- ; // a=10 , b= 9
       // System.out.println(a-- + --b); // 10 then a=9 + 8 ==> 18
        System.out.println(a-- - --a); //
     // a-- = 10 then a=9,
        // --a = 9-1=8
        // 10-8 = 2

    }
}
