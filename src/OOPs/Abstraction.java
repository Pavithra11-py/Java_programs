package OOPs;
//abstract class cannot have a object
public class Abstraction {
    public static void main(String[] args) {
        child c = new child();
        c.loan50k();     // here showimg by usimg child objects/class
        c.loan20k();
    }
}

   // By default JVM creates empty constructor --- Abstraction
    // hides complex implementation details and shows only essential info/features
    abstract class Father {
        abstract void loan50k();          // this is hidden
        // abstract means - incomplete metods/incomplete classes
       void loan20k(){
           System.out.println("20k loan given");
       }

    }

    class child extends Father{
        @Override
        void loan50k() {       // child is completing incomplete/abstract method of father
            System.out.println("child will pay the loan");
        }
    }

