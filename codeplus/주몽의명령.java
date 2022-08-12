import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] data = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N;i++){
            data[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data);

        int sIdx=0;
        int eIdx=N-1;
        int cnt=0;

        while (sIdx < eIdx) {
            if (data[sIdx] + data[eIdx] < M) {
                sIdx++;
            }else if (data[sIdx] + data[eIdx] > M) {
                eIdx--;
            }else if (data[sIdx] + data[eIdx] == M) {
                cnt++;
                sIdx++;
                eIdx--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
