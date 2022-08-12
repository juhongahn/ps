package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length())
                return o1.compareTo(o2);
            else
                return o1.length() - o2.length();
        });

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i].equals(arr[i-1])) continue;
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
