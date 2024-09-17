public class OOPS {
    int num1;
    // Constructor
    OOPS() { }
    OOPS(int num1) { this.num1 = num1; }
    public int showNum1() { return this.num1; }

    public static void main(String[] args) {
        // className objName = new constructor()
        OOPS oops = new OOPS(10);
        OOPS oops1 = new OOPS();
        System.out.println(oops.showNum1());
    }
}
