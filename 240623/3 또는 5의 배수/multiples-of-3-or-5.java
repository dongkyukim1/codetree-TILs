import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // a가 3의 배수인지 검사
        if (a % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // a가 5의 배수인지 검사
        if (a % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close(); // Scanner 닫기
    }
}