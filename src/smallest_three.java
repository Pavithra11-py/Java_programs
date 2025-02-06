public class smallest_three {
    public static void main(String[] args) {
        int x=23,y=87,z=19;
        int small = z< (x < y ? x : y) ? z : ((x < y) ? x : y);
        System.out.println("smallest is "+small);
    }
}
