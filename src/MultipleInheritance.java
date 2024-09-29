interface Sample {
    int MAX = 100;
    void show();
}
interface Sample2 {
    // default void show() { System.out.println("Show method implemented in Interface"); }
}
abstract class Demo implements Sample {
    // abstract void print();
}
class SampleClass extends A implements Sample, Sample2 {
    void print() {
        System.out.println(Sample.MAX);
    }

    @Override
    public void show() {

    }
}

class A {
    // void display();
//    void display() {
//        System.out.println("Class A is diplaying;");
//    }
}

class B {
    void display() {
        System.out.println("Class B is diplaying;");
    }
}

//class C extends A, B {
//    // Inteface
//}

public class MultipleInheritance {

    public static void main(String[] args) {
        SampleClass myClass = new SampleClass();
        myClass.show();
    }
}
