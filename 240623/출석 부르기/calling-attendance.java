import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int call = scanner.nextInt(); 

        int john = 1;
        int tom = 2;
        int paul = 3;

        if (call == 1) {
            System.out.println("John");
        } else if (call == 2) {
            System.out.println("Tom");
        } else if (call == 3) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }

    
    }
}