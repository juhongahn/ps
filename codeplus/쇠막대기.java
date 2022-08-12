import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        int idx = 0;
        for (char ch : chars) {
            idx++;
            if (ch==')') {
                if (idx - stack.pop() == 1) {
                    cnt += stack.size();
                } else {
                    cnt += 1;
                }
            } else {
                stack.push(idx);
            }
        }
        System.out.println(cnt);
    }

}
