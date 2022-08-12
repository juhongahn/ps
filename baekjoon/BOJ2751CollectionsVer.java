package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 다른 정렬을 배우고 다시해보자 퀵은 정렬이 거의 끝난 배열에는 최악의 경우 N^2이 걸린다.
public class BOJ2751CollectionsVer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);
        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i)).append('\n');
        }
        System.out.println(sb);
    }

}
