import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좋은수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            int k = A[i];
            int start = 0;
            int end = N-1;
            while (start < end) {
                if (A[start] + A[end] == k) {
                    if (start != k && end != k) {
                        cnt++;
                        break;
                    // start인덱스가 i와 같다는 것은 k와 A[start] 가 동일하다. 즉 자기 자시을 좋은수 만들기에 포함시키는것
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (A[start] + A[end] < k) {
                    start++;
                } else {
                    end--;
                }

            }
        }
        System.out.println(cnt);
        br.close();

    }
}
