// WAP to find the highest factor of a number 'n'(other than itself)
import java.util.Scanner;

public class questine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
         int n =sc.nextInt();
        // int hf=1;
        // for( int i=n-1;i>=1;i--){
        //     if(n%i==0){
        //         hf=i;
        //         // break;
        //         // System.out.println(i);
        //     }
                        
        // }
        
        // System.out.println(hf);
        // WAP  to check if  a number is prime or not/
        boolean flag = false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = true;
                break;
            
            }
        }
        if (n==1) 
           System.out.println("Neither prime nor Composite ");
            else if(flag == false)
            System.out.println("Primre number ");
            else
                 System.out.println("Composite Number  ");
            
              

        
    

    }
    
}
