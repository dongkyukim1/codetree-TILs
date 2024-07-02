import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt(); // 사용자가 입력할 정수의 개수
       int sumn = 0;

     
       for(int i = 0; i < n; i++){
           int num = sc.nextInt();
           if(num % 2 != 0 && num % 3 == 0){
               sumn += num;
           }
       }
       System.out.println(sumn);
    }
}