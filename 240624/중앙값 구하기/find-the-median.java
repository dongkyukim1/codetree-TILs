import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ave_num = 0;

        if ((a > b && a < c) || (a > c && a < b)) {
            ave_num = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            ave_num = b;
        } else {
            ave_num = c;
        }

        System.out.println(ave_num);
    }
}