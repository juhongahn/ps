import java.util.Scanner;

// 막힌다.
public class BJ1924 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = 0;
        
        // 1월 ~ 12월
        int[] month = new int[]{0, 31, 28, 31, 30,
                31, 30, 31, 31, 30, 31, 30, 31};

        String[] days = new String[]{"SUN", "MON", "TUE", "WED", "THU",
                "FRI", "SAT"};

        for (int i = 1; i <= x-1; i++) {
            total += month[i];
        }
        System.out.println(days[(total + y) % 7]);
    }


}
