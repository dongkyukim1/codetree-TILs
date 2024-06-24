import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max_number;

        if(a>b){
            if(a>c){
                max_number = a;
            }else{
                max_number = c;
            }
        }else{
            if(b>c){
                max_number = b;
            }else{
                max_number = c;
            }
        }
        System.out.println(max_number);

    }
}