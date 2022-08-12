import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ladder2 {

    static int[][] map;
    static int N = 100;
    static int [] dx = {0,0,1};
    static int [] dy = {-1,1,0};
    static int [][] start;

    public static void main(String[] args) throws IOException {

        // 입,출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 0; tc < 10; tc++) {

            int testCaseNum = Integer.parseInt(br.readLine());
            start = new int[1][N];
            map = new int[N][N];
            int min = 10001;
            int idx = 0;

            // 지도 입력
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 탐색
            for (int i = 0; i < 100; i++) {
                if (map[0][i] == 1) {

                    // 갔던 자리를 기록하기위한 새 지도
                    int[][] v = new int[100][100];

                    // 시작 인덱스
                    int x = 0;
                    int y = i;
                    int cnt = 0;

                    // 바닥에 닿을때 까지
                    while (x < 99) {
                        // 지나온 자리를 1로 만든다.
                        v[x][y] = 1;
                        // 왼쪽이 벽이 아니고, 가지 않았던 자리이고, 해당좌표의 값이 1일때 왼쪽으로 이동
                        if(y - 1 >= 0 && v[x][y - 1] == 0 && map[x][y - 1] > 0) {
                            y--;
                        }

                        // 오른쪽이 벽이 아니고, 가지 않았던 자리이고, 해당좌표의 값이 1일때 오른쪽으로 이동
                        else if(y + 1 < 100 && v[x][y + 1] == 0 && map[x][y + 1] > 0) {
                            y++;
                        }

                        // 아래 방향으로 이동
                        else if(x + 1 < 100 && v[x + 1][y] == 0 && map[x + 1][y] > 0){
                            x++;
                        }

                        // 이동했다면..
                        cnt++;
                    }

                    // 최솟값의 y좌표
                    if(cnt < min) {
                        min = cnt;
                        idx = i;
                    }

                }
            }
            System.out.println("#" + testCaseNum + " " + idx);
        }
    }

}
