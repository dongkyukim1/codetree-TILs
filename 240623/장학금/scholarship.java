import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int middle = sc.nextInt();
       int final_test = sc.nextInt();
       //중간고사에서 90점이상 받은자만 기말고사 95점 이상 10만원
       //중간고사에서 90점이상 받은자만 기말고사 90점 이상 5만원

       if(middle>=90 && final_test>=95){
        System.out.println("100000");
       }else if(middle>=90 && final_test>=90){
         System.out.println("50000");   
       }else{
        System.out.println("0");
       }
    }
}