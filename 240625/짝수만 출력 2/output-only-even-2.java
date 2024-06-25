import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();
        
        
        while (b >= a) {
            System.out.print(b + " ");
            b -= 2;
        }
    }
}