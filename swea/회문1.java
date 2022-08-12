import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 회문1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 0; test_case < 10; test_case++) {
            char[][] map = new char[8][8];
            int cnt = 0;
            int palLength = Integer.parseInt(br.readLine());

            // 맵 채우기
            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    map[i][j] = str.charAt(j);
                }
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8-palLength+1; j++) {
                    int flagX = 0;
                    for (int k = 0; k < palLength/2; k++) {
                        if (map[i][j+k] != map[i][j+palLength-k-1]){
                            flagX = -1;
                        }
                    }
                    if (flagX == 0) {
                        cnt++;
                    }
                }
            }

            for(int i =0; i<8-palLength+1;i++) {
                for(int j=0; j<8;j++) {
                    int flagY = 0;
                    for (int k = 0; k < palLength/2; k++) {
                        if (map[i+k][j] != map[i+palLength-k-1][j]){
                            flagY = -1;
                        }
                    }
                    if(flagY==0) {
                        cnt++;
                    }
                }
            }
            System.out.printf("#%d %d\n", test_case+1, cnt);

        }
    }
}
