import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스트링BruteForce {

    // 부르트 포스
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int testCase = 0; testCase < 10; testCase++) {
            int testNumber = Integer.parseInt(br.readLine());
            char[] patterns = br.readLine().toCharArray();
            char[] data = br.readLine().toCharArray();
            int cnt = 0;

            int i = 0;
            int j = 0;
            while (j < patterns.length && i < data.length) {
                if (data[i] != patterns[j]){
                    i -= j;
                    j = -1;
                }
                i += 1;
                j += 1;

                if (j == patterns.length) {
                    cnt++;
                    j = 0;
                }
            }
            System.out.printf("#%d %d\n",testNumber, cnt);
        }
    }
}
