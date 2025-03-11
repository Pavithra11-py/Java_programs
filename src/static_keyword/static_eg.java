package static_keyword;

public class static_eg {
    public static void main(String[] args) {
        student s1=new student(23);
        System.out.println(s1.age);
        student s2= new student(33);
        System.out.println(s2.age);
        System.out.println(s1.coursename);
        System.out.println(s2.coursename);
       student.m1();   // can call directly using class name
        // no need to create object
    }
}

class student{
    int age;  // non-static variable
    static String coursename="ATB";   // common and available to all references

    public student(int a){
        this.age=a;
    }
    static void m1(){
        System.out.println("methos m1");
    }
}
