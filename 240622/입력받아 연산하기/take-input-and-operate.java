import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // 두 정수를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 첫 정수에 + 87
        int sum_87 = a+87;

        // 두번째 수 % 10 으로나눈 나머지
        int remind_10 = b%10;

        System.out.println(sum_87);
        System.out.println(remind_10);

    }
}