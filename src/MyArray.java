import java.util.Scanner;
public class MyArray {
    public static void display(int[] arr) {
        int N = arr.length;
        for(int i=0; i < N; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i < N; i++)
            arr[i] = sc.nextInt();

        display(arr);
    }
}
