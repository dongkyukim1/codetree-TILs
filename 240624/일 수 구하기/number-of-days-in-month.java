import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
    if((a % 2 == 1 && a<9) || (a % 2 ==0 && a>7)){
		System.out.println(31);
        }else if(a==2){
            System.out.println(28);
        }else if((a % 2 ==0 && a<7) || (a % 2==1 && a>7)){
        System.out.println(30);
        }
    
    }
}