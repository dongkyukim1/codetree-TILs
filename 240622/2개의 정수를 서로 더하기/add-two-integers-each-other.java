import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        // b에 a를 더한 값을 b에 저장
        b = b + a;

        // a에 b를 더한 값을 a에 저장
        a = b + a; 

        // 결과 출력
        System.out.println(a + " " + b);
    }
}