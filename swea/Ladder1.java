import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ladder1 {

    static int [][] map;
    static int N = 100, arrX, arrY, answer;

    // 델타, 아래서부터 진행할 것이다. (도착지가 나와있으므로 거기서 출발해서 출발지를 역으로 찾을것이다.)
    static int[] dx = {0, 0, -1};
    static int[] dy = {-1, 1, 0};

    public static void main(String[] args) throws IOException {

        // 입,출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc = 0; tc < 10; tc++) {
            int testCaseNum = Integer.parseInt(br.readLine());
            map = new int[N][N];

            // 지도 입력
            for (int i = 0; i < N; i++) {
                // 행을 읽을 때마다 한 줄씩 읽어옴.
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());

                    // 도착지 기록
                    if (map[i][j] == 2) {
                        arrX = i;
                        arrY = j;
                    }
                }
            }

            // 출발지 좌표를 입력, 출구로 이동하는 메서드
            move(arrX, arrY);
            sb.append("#"+testCaseNum+" "+answer+"\n");
        }
        System.out.println(sb);
    }

    private static void move(int x, int y) {

        while(true) {

            // x가 0, 즉 지도 맨 끝에 도착했을 때 루프 종료, 이 때 y값이 정답.
            if (x == 0) {
                answer = y;
                break;
            }

            // 이동 로직 시작, 델타를 돌면서 해당 좌표의 값이 1인경우 이동함.
            for (int i = 0; i < 3; i++) {

                // 왼쪽, 오른쪽, 위 이렇게 움직인다.
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 경계를 넘지말고, 해당 좌표값이 1일경우 이동.
                if (nx >= 0 && nx < N && ny >= 0 && ny < N  && map[nx][ny] == 1) {

                    // 지나온 자리는 3으로 만들어줌.
                    map[x][y] = 3;
                    x = nx;
                    y = ny;
                }
            }
        }
    }
}
