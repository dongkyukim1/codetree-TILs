import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aCount = 0; // 'A'의 개수를 세기 위한 변수
        
        // 3명의 입력을 처리합니다.
        for (int i = 0; i < 3; i++) {
            String b = sc.next();
            int a = sc.nextInt();
            String rs = "";

            if (b.equals("Y")) {
                if (a >= 37) {
                    rs = "A";
                    aCount++;
                } else {
                    rs = "C";
                }
            } else if (b.equals("N")) {
                if (a >= 37) {
                    rs = "B";
                } else {
                    rs = "D";
                }
            }
        }

        // 위급상황 판단
        if (aCount >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}