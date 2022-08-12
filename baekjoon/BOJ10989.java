package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        int[] count = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int idx = Integer.parseInt(br.readLine());
            count[idx-1]++;
        }

        for (int i = 0; i < 10001; i++) {
            if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++) {
                    sb.append(i+1).append('\n');
                }
            }
        }
        System.out.println(sb);

    }
}
