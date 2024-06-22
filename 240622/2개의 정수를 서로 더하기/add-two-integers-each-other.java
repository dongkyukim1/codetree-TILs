import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // b에 a를 더함
        b = b+a;
        //4 = 3+1

        //a에 그 b를 더함
        a = b+3*a;


        System.out.println(b+" "+ a);
    }
}