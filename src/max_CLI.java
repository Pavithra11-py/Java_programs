public class max_CLI {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String maximum = num1 > num2 ? "Greater is "+num1 : "Greater is "+num2;
        System.out.println(maximum);
    }
}
