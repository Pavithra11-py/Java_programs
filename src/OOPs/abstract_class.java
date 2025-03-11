package OOPs;

import org.w3c.dom.ls.LSOutput;

public class abstract_class {
    public static void main(String[] args) {
           Wagon w1 = new Wagon();
           w1.drive();
    }
}

class Wagon extends Engine{
    void startengine(){
        System.out.println("Start");
    }
    void stopengine()
    {
        System.out.println("stop");
    }

    void drive(){
        System.out.println("Iam driving");
        startengine();
        stopengine();
    }
}

abstract class Engine{
    abstract void startengine();
    abstract void stopengine();

}