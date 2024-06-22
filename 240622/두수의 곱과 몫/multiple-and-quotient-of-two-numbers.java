import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 곱셈 결과와 식 출력
        int multiplicationResult = a * b;
        System.out.println(a + " * " + b + " = " + multiplicationResult);

        // 나눗셈 결과와 식 출력
        int divisionResult = a / b;
        System.out.println(a + " / " + b + " = " + divisionResult);
    }
}