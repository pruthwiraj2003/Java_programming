// print all the evenand odd number from 1 to 100 
import java.util.Scanner;
public class problame02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ente z");
        int z= sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i = z; i<=n; i++){
        
            if(i%3==0)  System.out.println(i);
            
            
        }
    }
    
}
