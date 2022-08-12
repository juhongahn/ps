import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 거듭제곱 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);



        for (int test_case = 0; test_case < 10; test_case++) {
            int[] dp = new int[1000];
            int testNumber = sc.nextInt();
            int number = sc.nextInt();
            int power = sc.nextInt();

            dp[0] = 0;
            dp[1] = number;

            for (int i = 2; i <= power; i++) {
                dp[i] = dp[i - 1] * number;
            }
            System.out.printf("#%d %d\n", testNumber,dp[power]);
        }
    }
}
