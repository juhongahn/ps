import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class 단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine() + "\n";

        char[] chars = str.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = false;

        for (char ch : chars) {
            if (ch == ' ' && flag == false ||
                ch == '\n' && flag == false) {
                flip(deque);
                System.out.print(" ");
            }else if (ch == '>'){
                // 태그를 벗어나면 flag 를 false
                deque.push(ch);
                while (!deque.isEmpty()) {
                    System.out.print(deque.pollLast());
                }
                flag = false;
            } else {
                // < 안이라면 flag 를 true
                if (ch=='<' && deque.isEmpty()) {
                    flag = true;
                    deque.push(ch);
                } 
                // 배열 중간에 만난 '<' 일 때 앞 데이터를 출력
                else if(ch=='<' && !deque.isEmpty()) {
                    flip(deque);
                    deque.push(ch);
                    flag = true;

                } else {
                    deque.push(ch);
                }

            }
        }

        bw.flush();
        br.close();
    }

    static void flip(Deque<Character> deque){
        while (!deque.isEmpty()) {
            System.out.print((deque.pop()));
        }
    }
}
