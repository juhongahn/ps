import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Flatten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int dumpCnt = Integer.parseInt(br.readLine());
            int[] a = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = 0;
            while (st.hasMoreTokens()) {
                a[idx++] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < dumpCnt; j++) {
                Arrays.sort(a);
                a[99] -= 1;
                a[0] += 1;
            }
            Arrays.sort(a);
            System.out.println("#" + test_case +" "+ (a[99] - a[0]));
        }
    }
}
