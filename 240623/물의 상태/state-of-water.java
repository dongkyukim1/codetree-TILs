import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int water = sc.nextInt();
        if(water>=100){
            System.out.println("vapor");
        }else if(water<100 && water>0){
            System.out.println("water");
        }else{
            System.out.println("ice");
        }

     }
}