import java.util.Arrays;
import java.util.Scanner;

public class 큰수법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        int sum = 0;
        int idx = arr.length;

        Arrays.sort(arr);
        for (int i = M-1; i >= 0; i--) {
            for (int j = 0; j < K; j++) {

            }
        }

        System.out.println("sum = " + sum);
    }
}
