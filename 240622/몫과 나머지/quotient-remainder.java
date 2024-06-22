import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 두 정수를 나눈 몫
        int division = a/b;
        
        // 두 정수를 나눈 나머지
        int remainder = a%b;
        

        System.out.println(division+"..."+remainder);


     }
}