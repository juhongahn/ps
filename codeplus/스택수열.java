import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {

    public static void solve(int[] a) {
        int n = a.length;
        Stack<Integer> stack = new Stack<>();

        // 현재 커서 위치
        int m = 0;

        StringBuilder sb = new StringBuilder();
        for (int x : a) {
            // x는 만들어야하는 수, 즉 pop 해내야 하는수
            if (m < x) {
                while (m < x) {
                    stack.push(++m);
                    sb.append("+\n");
                }
                // 꺼내면서 수열을 만든다.
                stack.pop();
                sb.append("-\n");
            }
            else {
                //스택에서 뺌으로써 수열을 만드는데,
                // 만약 뺏을 때 바로 x가 되지 못한다면 만들수 없는 수열
                if (stack.peek() != x) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a);
    }
}
