import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 사용자로부터 입력받은 정수

        // 짝수일 경우 2로 나눈 값을 출력
        if (a % 2 == 0) {
            a = a / 2;
        }

        // 홀수일 경우 1을 더한 후 2로 나눈 값을 출력
        if (a % 2 != 0) {
            a = (a + 1) / 2;
            System.out.println(a);
        }
    }
}