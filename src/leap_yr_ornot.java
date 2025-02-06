
public class leap_yr_ornot {
    public static void main(String[] args) {
       int year = 2020;
        boolean  leapyear = (year%4==0) && ( (year!=0) || (year%400==0));
        if(leapyear){
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
    }
}
