import java.util.Scanner;

public class 평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String data = sc.nextLine();
        String[] splitData = data.split(" ");
        int max = -1;
        int sum = 0;
        for (String s : splitData){
            if (Integer.parseInt(s) > max) {
                max = Integer.parseInt(s);
            }
        }

        for (String s : splitData) {
            sum += Integer.parseInt(s);
        }

        double r = sum * 100.0 / max / N;
        System.out.println(r);
    }
}
