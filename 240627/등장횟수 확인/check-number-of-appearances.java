import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int cnt2 = 0;

        // 5개의 숫자를 입력 받음
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // 입력받은 숫자 중 짝수의 개수를 세기
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                cnt2++;
            }
        }

        System.out.print(cnt2);
    }
}