import java.util.Scanner;

public class 연속된자연수합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sIdx=1;
        int eIdx=1;
        int cnt=1;
        int sum=1;
        while (eIdx !=N ) {
            if (sum == N) {
                eIdx++;
                sum += eIdx;
                cnt++;
            } else if (sum < N) {
                eIdx++;
                sum += eIdx;
            } else if (sum > N) {
                sum -=sIdx;
                sIdx++;
            }
        }
        System.out.println(cnt);
    }
}
