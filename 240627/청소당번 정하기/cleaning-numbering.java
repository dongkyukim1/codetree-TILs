import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int class_clean = 0;
        int road_clean = 0;
        int toliet_clean = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                toliet_clean++;
            } else if (i % 3 == 0) {
                road_clean++;
            } else if (i % 2 == 0) {
                class_clean++;
            }
        }
        System.out.print(class_clean + " " + road_clean + " " + toliet_clean);
    }
}