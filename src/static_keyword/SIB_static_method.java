package static_keyword;

public class SIB_static_method {
    public static void main(String[] args) {
        A a=new A();
    }
}

class A{
    static {
        System.out.println("called only once when class is loaded!");
    }
    static int a=10;
    static void m1(){
        System.out.println("static function");
    }
//    static class B{
//        //not useful
//    }
}
