import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class 에디터 {

    public static void main(String[] args) throws IOException {
        LinkedList<Character> linkedList = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();
        for (char ch : charArray) {
            linkedList.add(ch);
        }

        ListIterator<Character> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        listIterator.add('x');
        listIterator.previous();
        listIterator.add('y');

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
