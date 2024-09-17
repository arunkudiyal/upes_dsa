class Person {
    private int age; private String name;
    Person() { System.out.println("Person Object Created"); }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class Student extends Person {
    int rNo; int totalMarks;
    Student() { System.out.println("Student Object Created"); }
}

class InheritanceExample {
    public static void main(String[] args) {
        /* Student student1 = new Student();
        Student student2 = null;
        student2 = student1;
        System.out.println(student1);                   // Student@29453f44
        System.out.println(student2);
        System.out.println(student1.getName()); */

        // refrence variable of parent class
        Person person1;
        person1 = new Student();
        // Person person2 = new Student();
        System.out.println(person1.getAge());           // 0
    }
}
