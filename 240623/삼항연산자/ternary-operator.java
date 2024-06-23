import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 100;
        String b = a == c ? "pass" : "failure";
        
        System.out.println(b);
    }
}