import java.util.Scanner;
public class revession {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);     //print 1 to 100
      System.out.println("Enter the value of n");
      int n =sc.nextInt();
     // System.out.println("Enter the value of m");
      //int m=sc.nextInt();
      for(int i=1;i<=n;i++){
        if(i%2==0) {
         System.out.println("Even  no." +i);
        }
        else{
            System.out.println("Odd no"+i);
        } 

        
      }
        
    }

    
}
