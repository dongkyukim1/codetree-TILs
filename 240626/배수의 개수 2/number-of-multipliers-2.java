import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] numbers = new int[10];
        
        int oddCount = 0;
        
        // 10개의 정수를 입력 받음

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        // 홀수의 개수를 출력
        System.out.println(oddCount);
    }
}