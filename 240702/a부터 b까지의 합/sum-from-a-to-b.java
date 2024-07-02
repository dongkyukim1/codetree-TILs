import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumab =0;
        for(int i=a;i<=b;i++)
            if(a<b){
                sumab += i;
            }
            System.out.println(sumab);
    }
}