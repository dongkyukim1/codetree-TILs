import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int cnt3 = 0;
        int cnt5 = 0;

        for(int i =0 ; i<10; i++){
            numbers[i] = sc.nextInt();
            if(numbers[i]%3==0){
                cnt3++;
            }
            if(numbers[i]%5==0){
                cnt5++;
            }
           
        }
         System.out.print(cnt3+" "+cnt5);    
    }
}