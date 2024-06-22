import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        
        Scanner sc_1 = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f",a);
        System.out.println("");
        System.out.printf("%.2f",b); 
   }
}