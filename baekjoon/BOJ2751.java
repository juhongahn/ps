package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다른 정렬을 배우고 다시해보자 퀵은 정렬이 거의 끝난 배열에는 최악의 경우 N^2이 걸린다.
public class BOJ2751 {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[1000001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arr, 0, N-1);
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int key = start;
        int i = start + 1;
        int j = end;

        int temp;

        // 교차하면 탈출
        while (i <= j) {

            // 피봇의 값과 비교해서 크거나 작으면 while을 탈출
            while (i <= end && arr[i] <= arr[key]) {
                i++;
            }

            while (arr[j] >= arr[key] && j > start) {
                j--;
            }

            if (i > j) {
                temp = arr[key];
                arr[key] = arr[j];
                arr[j] = temp;
            } else {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
    }
}
