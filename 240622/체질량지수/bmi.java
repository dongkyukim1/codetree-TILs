import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 178;
        int b = 88;
        int c = 10000* b/(h*h);
        System.out.println(c);
        if(c>25){
            System.out.println("Obesity");
        }
    }
}