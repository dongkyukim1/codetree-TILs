import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age_a = sc.nextInt();
        String gender_a = sc.next();
        int age_b = sc.nextInt();
        String gender_b = sc.next();

        if((age_a>=19 && gender_a.equals("M"))||(age_b>=19 && gender_b.equals("M"))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}