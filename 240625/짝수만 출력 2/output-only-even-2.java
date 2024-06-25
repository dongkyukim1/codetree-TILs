public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        if (a % 2 != 0) {
            a -= 1;
        }

        while(a>=b){
            
            System.out.print(a+" ");
            a-=2;
        }
    }
}