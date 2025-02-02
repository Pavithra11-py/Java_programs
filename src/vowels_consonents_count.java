import java.util.Scanner;

public class vowels_consonents_count {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your string :");
        String alp= sc.nextLine();
        int count=0,cons=0;
        for (int i=0;i<alp.length();i++)
        {
            char ch = alp.charAt(i);
            if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch =='E'||ch=='I'||ch=='O'||ch=='U')
          {// || ('A','E','I','O','U')){
            count = count + 1;
        }
        else
        {
            cons = cons+1;

        }}
            System.out.println("vowels count is "+count);
            System.out.println("consonents count is "+cons);

}}
