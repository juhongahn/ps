import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int testCaseNum = Integer.parseInt(br.readLine());
            int[][] arr = new int[101][101];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println("#" + testCaseNum + " " + Math.max(sumX(arr), Math.max(sumY(arr), sumZ(arr))));


        }
    }


    static int sumX(int[][] a) {

        int max = 0;
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            for (int j = 0; j < 100; j++) {
                sum += a[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    static int sumY(int[][] a) {

        int max = 0;
        for (int j = 0; j < 100; j++) {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += a[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    static int sumZ(int[][] a) {

        int sumLR = 0;
        int sumRL = 0;

        for (int i = 0; i < 100; i++) {
            sumLR += a[i][i];
        }

        for (int i = 0; i < 100; i++) {
            sumRL = a[i][100-i];
        }


        return Math.max(sumLR, sumRL);

    }
}
