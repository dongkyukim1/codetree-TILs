import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        // 윤년 판단 로직
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}