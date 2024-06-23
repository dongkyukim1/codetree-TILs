import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        if (n >= 3000) {
            System.out.println("book");
        } else if (n >= 1000) {
            System.out.println("mask");
        } else if (n >= 500) {
            System.out.println("pen");
        } else {
            System.out.println("no");
        }

        sc.close(); // Scanner를 닫아 리소스를 해제합니다.
    }
}