import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String b = sc.next();
      int a = sc.nextInt();
      String rs;

      if(b.equals("Y")){
        if(a>=37){
            rs = "A";
        }else{
            rs ="C";
        }
      if(b.equals("N")){
        if(a>=37){
           rs = "B";     
        }else{
           rs ="D"; 
        }  
      }
      if(rs.equals("A")){
        System.out.println("E");
      }else{
        System.out.println("N");
      } 
   
    }
  }
}