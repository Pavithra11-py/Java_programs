package feb_22_prac;

public class generic {

    public static void main(String[] args) {
        temp(43,65);
        temp("ugwbdoij",867);
    }
    public static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}

