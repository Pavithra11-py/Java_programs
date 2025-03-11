package OOPs;

public class super_constructor {
    public static void main(String[] args) {
           car c1=new car();
           c1.display();
    }
}
class vehicle{
    public  int maxspeed= 160;


    vehicle()
    {
        System.out.println("Default Const");
    }
    vehicle(int a){
        System.out.println("Parameterized const");
    }
    void message(){
        System.out.println("No arguments,No return Func");
    }
    void message(int a){
        System.out.println("With arguments func");
    }
}

class car extends vehicle {
    private int maxspeed=280;
    car(){
        super(200);  // calling constructor of a parent class
    }
    void test(){
        System.out.println("Test");
    }
    car(int a){
        System.out.println("Param const- car");
    }
    void display(){
        System.out.println("Override-car");
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.message(); // callling funcn of parent class
        this.test(); //  calling funcn of current class
    }

}
