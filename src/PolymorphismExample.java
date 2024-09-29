public class PolymorphismExample {
    public void show() { System.out.println("Shoe method executed"); }
    // public int show() { System.out.println("Shoe method executed"); }
    public void show(int data, String name) { System.out.println("Int Data " + data);}
    public void show(String name, int data) { System.out.println("Int Data " + data);}
    public static void main(String[] args) {
        PolymorphismExample example = new PolymorphismExample();
        example.show();
        example.show(10, "Arun");
    }
}
