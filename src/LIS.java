import java.util.Scanner;

public class LIS {
    public static int lis(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        output[0] = 1;
        for(int i=1; i < n; i++) {
            for(int j=i-1; j >= 0; j--) {
                if(arr[j] > arr[i]) continue;
                int pA = output[j] + 1;
                if(pA > output[i]) output[i] = pA;
            }
        }
        int best = 1;
        for(int i=0; i <n; i++) if(output[i] > best) best = output[i];

        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i < N; i++)
            arr[i] = sc.nextInt();

        System.out.println( lis(arr) );
    }
}
