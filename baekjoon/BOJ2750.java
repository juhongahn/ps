package 정렬;

import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int idx=0;
        int temp;

        for (int i = 0; i < N; i++) {
            int min = 1001;
            for (int j = i; j < N; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
