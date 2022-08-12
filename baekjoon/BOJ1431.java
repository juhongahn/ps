package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (str1, str2) -> {
            if (str1.length() != str2.length()) {
                return str1.length() - str2.length();

            } else {
                char[] chars1 = str1.toCharArray();
                char[] chars2 = str2.toCharArray();
                int sum1 = 0;
                int sum2 = 0;

                for (char c1 : chars1) {
                    if (c1 >= '0' && c1 <= '9'){
                        sum1 += c1 - '0';
                    }
                }
                for (char c2 : chars2) {
                    if (c2 >= '0' && c2 <= '9'){
                        sum2 += c2 - '0';
                    }
                }

                if (sum1 == sum2) {
                    return str1.compareTo(str2);
                }
                return sum1 - sum2;
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);

    }
}
