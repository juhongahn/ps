import java.io.IOException;
import java.util.Scanner;

public class 길찾기 {

    static int[][] arr;
    static boolean[] visited;
    static int find;


    // 재귀를 사용한다.
    public static void dfs(int x) {

        // 호출된 재귀함수중 어떤 함수가 길을 찾았다면
        if (find == 1) return;

        // 아니면 이번 호출에서 길을 찾았다면
        if (x == 99) {
            find = 1;
            return;
        }

        // 방문 했으니 표시
        visited[x] = true;

        // 재귀 시작, 방문하지 않았고, 해당 길이 있다면
        // 0~99까지 노드가 있다. 그걸 탐색
        for (int i = 0; i < 100; i++) {
            if (!visited[i] && arr[x][i] == 1) {
                dfs(i);
            }
        }
        visited[x] = false;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        for (int test_case = 0; test_case < 10; test_case++) {
            int testCaseNumber = sc.nextInt();
            int n = sc.nextInt();

            arr = new int[100][100];
            visited = new boolean[100];

            find = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y] = 1;
            }
            dfs(0);
            System.out.printf("#%d %d\n", testCaseNumber, find);

        }
    }
}
