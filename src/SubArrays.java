import java.util.Scanner;

public class SubArrays {
    public static void printSubArrays(int[] arr) {
        int n = arr.length;
        for(int i=0; i < n; i++) {
            for(int j=i; j < n; j++) {
                for(int k=i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printSubArrayUsingSW(int[] arr) {
        int N = arr.length;
        for(int window = 1; window <= N; window++) {
            for(int start = 0; start <= (N-window); start++) {
                int end = (start + window) - 1;
                for(int i=start; i <= end; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i < N; i++)
            arr[i] = sc.nextInt();

        // printSubArrays(arr);
        printSubArrayUsingSW(arr);
    }
}
