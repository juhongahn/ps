import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호짝짓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test_case = 0; test_case < 10; test_case++) {
            int testLength = Integer.parseInt(br.readLine());
            Stack<Character> stack = new Stack<>();

            String data = br.readLine();
            for (int i = 0; i < testLength; i++) {
                char charData = data.charAt(i);
                if (charData == ')' && stack.peek() == '(') stack.pop();
                else if (charData == '>' && stack.peek() == '<') stack.pop();
                else if (charData == ']' && stack.peek() == '[') stack.pop();
                else if (charData == '}' && stack.peek() == '{') stack.pop();
                else {
                    stack.push(charData);
                }

            }
            if (stack.isEmpty()) {
                System.out.printf("#%d 1\n", test_case+1);
            } else {
                System.out.printf("#%d 0\n", test_case+1);
            }

        }

    }
}
