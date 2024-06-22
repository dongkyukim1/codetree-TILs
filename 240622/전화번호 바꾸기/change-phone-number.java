import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); // 올바른 구분자 설정

        int a = sc.nextInt(); // 첫 번째 숫자 입력 (010)
        int b = sc.nextInt(); // 두 번째 숫자 입력 (5678)
        int c = sc.nextInt(); // 세 번째 숫자 입력 (1234)
        int temp;

        // 숫자 교환
        temp = b;
        b = c;
        c = temp;


        // 결과 출력
        System.out.println("0"+a + "-" + b + "-" + c);
    }
}