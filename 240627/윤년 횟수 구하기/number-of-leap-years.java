import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int leapYearCount = 0;

        for (int i = 1; i <= year; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        leapYearCount++;
                    }
                } else {
                    leapYearCount++;
                }
            }
        }

        System.out.print(leapYearCount);
    }
}