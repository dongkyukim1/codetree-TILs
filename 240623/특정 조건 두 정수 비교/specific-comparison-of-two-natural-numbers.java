import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 결과 값을 저장할 변수 선언
        int result1, result2;
        
        // 첫 번째 결과 값 계산
        if (a < b) {
            result1 = 1;
        } else {
            result1 = 0;
        }
        
        // 두 번째 결과 값 계산
        if (a == b) {
            result2 = 1;
        } else {
            result2 = 0;
        }
        
        // 결과 값 출력
        System.out.println(result1 + " " + result2);
        
        sc.close(); // Scanner 닫기
    }
}