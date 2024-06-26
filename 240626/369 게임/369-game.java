import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || contains369(i)) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    // 숫자에 3, 6, 9가 포함되어 있는지 확인하는 함수
    public static boolean contains369(int num) {
        String strNum = Integer.toString(num);
        return strNum.contains("3") || strNum.contains("6") || strNum.contains("9");
    }
}