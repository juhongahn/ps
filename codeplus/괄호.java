import java.io.*;
import java.util.Stack;


// 스택 없이도 구현가능.
public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            for (char ch : br.readLine().toCharArray()) {
                if (ch == ')') {
                    if (!stack.isEmpty())
                        stack.pop();
                    else{
                        stack.push('f');
                        break;
                    }
                } else {
                    stack.push(ch);
                }
            }
            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

        }
        bw.flush();
        br.close();
    }
}
