package feb_22_prac;

public class try_catch {
    public static void main(String[] args) {
        int a = 1;
        int c= 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed!");
        }
        System.out.println(c);
    }
}
