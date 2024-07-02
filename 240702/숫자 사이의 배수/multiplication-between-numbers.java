import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumab = 0;
        int count = 0; // 5 또는 7의 배수의 개수를 세기 위한 변수
        double aveab = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumab += i;
                count++;
            }
        }

        // 5 또는 7의 배수가 하나라도 있을 경우에만 평균을 계산합니다.
        if (count > 0) {
            aveab = (double) sumab / count;
        }

       System.out.printf("%d %.1f\n", sumab, aveab);
    }
}