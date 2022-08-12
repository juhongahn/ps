import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class View {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int testCase = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int views = 0;

            int[] data = new int[testCase];
            int idx = 0;
            while (st.hasMoreTokens()) {
                data[idx++] += Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < testCase; j++) {
                views += viewCnt(data, j);
            }
            System.out.println("#"+(i+1) +" "+ views);
        }
    }

    static int viewCnt(int[] data, int idx) {

        if (idx == 0 || idx == 1 || idx == data.length - 1 || idx == data.length - 2) {
            return 0;
        }

        if (data[idx] < data[idx+2] || data[idx] < data[idx+1] ||
                data[idx] < data[idx-1] || data[idx] < data[idx-2]) {
            return 0;
        } else {
            int max = Math.max(data[idx + 2], Math.max(data[idx + 1], Math.max(data[idx - 1], data[idx - 2])));
            return data[idx] - max;
        }
    }
}
