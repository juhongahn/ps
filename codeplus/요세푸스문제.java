import java.util.LinkedList;
import java.util.Scanner;

public class 요세푸스문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int idx = 0;

        // 링크드리스트에서 k번째 사람을 삭제해야함.
        // idx에 k만큼 더해주면 n보다 큰 순간이 오는데,
        // 그때는 n으로 나눈나머지 인덱스의 데이터를 지워주면된다.
        while (list.size() > 1) {
            idx = (idx + (k - 1)) % list.size();
            sb.append(list.remove(idx)).append(", ");
        }

        sb.append(list.remove()).append(">");
        System.out.println(sb);

        sc.close();


    }
}
