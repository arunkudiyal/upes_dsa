class A {
    void display() {
        System.out.println("Class A is diplaying;");
    }
}

class B {
    void display() {
        System.out.println("Class B is diplaying;");
    }
}

interface Sample {
    
}

class C extends A, B {
    // Inteface
    C objC = new C();
    objC.display();
}

public class MultipleInheritance {

    public static void main(String[] args) {

    }
}
