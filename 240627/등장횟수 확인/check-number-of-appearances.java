import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int cnt2=0;
        for(int i = 1 ; i<5;i++){
            numbers[i] = sc.nextInt();
            if(i%2==0){
                cnt2++;
            }
        }
        System.out.print(cnt2);
    }
}