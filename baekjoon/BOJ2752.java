package 정렬;

import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int idx=0;
        int temp;

        for (int i = 0; i < 3; i++) {
            int min = 1000001;
            for (int j = i; j < 3; j++) {
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
            System.out.printf("%d ", i);
        }
    }
}
