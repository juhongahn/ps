import java.io.*;
import java.util.Stack;

public class 오등큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] data = br.readLine().split(" ");
        int[] A = new int[N];
        int[] NGF = new int[N];
        int[] freq = new int[1000001];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(data[i]);
            // 빈도 저장
            freq[A[i]] += 1;
        }

        stack.push(0);
        for (int i = 1; i < N; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            // 스택의 최상단의 원소와 다음 대상과 비교시, 다음 대상이 더 클때
            // 오큰수가 된다.
            while (!stack.isEmpty() && freq[A[stack.peek()]] < freq[A[i]]) {
                NGF[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            NGF[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<N; i++) {
            bw.write(NGF[i] + " ");
        }
        bw.write("\n");
        bw.flush();

    }
}
