public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        if (a % 2 != 0) {
            a -= 1;
        }

         if (b % 2 != 0) {
            b--;
        }
        
        while(a>=b){
            
            System.out.print(a+" ");
            a-=2;
        }
    }
}