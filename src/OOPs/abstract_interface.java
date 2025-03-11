package OOPs;

public class abstract_interface {
    public static void main(String[] args) {
        car1 cars=new car1();
        cars.drive();
    }

}

class car1 implements Engine1,brake {

    void drive ()
    {
        startengine();
        applybreak();stopengine();
    }
    @Override
    public void applybreak() {
        System.out.println("Apply brake");
    }
    @Override
    public void startengine(){
        System.out.println("start");
    }
    @Override
    public void stopengine(){
        System.out.println("stop");
    }
}

//interface provides complete abstraction, comtaining only method declarations without implementation.....
interface brake{
    void applybreak();

//    void test(){
//        System.out.println("complete func can't be created");
//    }
}
interface Engine1{
    void startengine();
    void stopengine();
}