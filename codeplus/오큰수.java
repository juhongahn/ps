import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] data = br.readLine().split(" ");
        int[] A = new int[N];
        int[] NGE = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(data[i]);
        }

        stack.push(0);
        for (int i = 0; i < N; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            // 스택의 최상단의 원소와 다음 대상과 비교시, 다음 대상이 더 클때
            // 오큰수가 된다.
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                NGE[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            NGE[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<N; i++) {
            bw.write(NGE[i] + " ");
        }
        bw.write("\n");
        bw.flush();

    }
}
