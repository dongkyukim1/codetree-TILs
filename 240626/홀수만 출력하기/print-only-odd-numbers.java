import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
    
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}