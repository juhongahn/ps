import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            String str = br.readLine() + "\n";
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        bw.flush();
        br.close();
    }
}
