import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useDelimiter("\\.");
       int yyyy = sc.nextInt();
       int mm = sc.nextInt();
       int dd = sc.nextInt();
       int temp;

       temp = yyyy;
       yyyy = mm;
       mm = dd;
       dd = temp;

       System.out.println(yyyy+"-"+mm+"-"+dd);
    }
}