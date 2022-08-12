import java.util.Scanner;

// char를 int로 형변환 하는게 포인트.
public class 숫자의합구하기 {
    public static void main(String[] args) {
        // N은 100까지므로 int나 long형으로 받을수 없다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String data = sc.next();
        char[] charArray = data.toCharArray();
        int sum = 0;

        // char 형을 int형으로 전환하려면, '0'(48)을 빼줘도되고
        // 레퍼런스형의 정적함수를 사용해도 된다.
        for (int i=0; i< charArray.length; i++) {
            sum += Character.getNumericValue(charArray[i]);
        }
        System.out.println(sum);
    }
}
