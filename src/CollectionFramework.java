import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionFramework {
    public static void main(String[] args) {
        // create the object
        // syntax :- ClassName<WrapperClass> obj = new const<>();
        ArrayList<Integer> al = new ArrayList<>(3);
        LinkedList<Integer> ll = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);                 //
    }
}
