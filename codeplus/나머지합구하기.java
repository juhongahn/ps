import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지합구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;
        int[] S = new int[N];
        int[] C = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<N ;i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        int[] mS = new int[N+1];
        for (int i=0;i<N;i++){
            int reminder = (int) (S[i] % M);
            if (reminder == 0) result++;
            // 나머지가 같은 원소들 카운트
            C[reminder]++;
        }

        for (int i=0;i<M;i++){

            // 나머지가 0인것들은 이미 카운트함
            if (C[i] > 0){
                //필요한건 나머지가 같은 원소들중 2개를 뽑을 경우의수
                result += (C[i] * (C[i]-1) / 2);
            }
        }
        System.out.println(result);

    }
}
