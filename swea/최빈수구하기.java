import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최빈수구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            test_case = Integer.parseInt(br.readLine());
            System.out.print("#" + test_case + " ");

            int[] cnt = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while (st.hasMoreTokens()) {

                // 카운트 배열에 학생 점수 빈도를 기록.
                cnt[Integer.parseInt(st.nextToken())] += 1;
            }

            // 카운트 배열에서 가장 큰 값의 인덱스를 찾자.
            // 같은 빈도라면 더 높은, 즉 카운트 배열의 인덱스가 더 큰 값이 우선. '>= 연산자'
            int max = 0;
            int result = 0;
            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] >= max) {
                    max = cnt[i];
                    result = i;
                }
            }
            System.out.println(result);
        }




    }
}
