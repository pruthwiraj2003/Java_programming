// WAP to count digit of a given number 
import java . util.Scanner ;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        //  int count =0;
        //  if(n==0) count++;
        // while(n!=0){
        //     n/=10;
        //     count++;
        // }
        // System.out.println(count);
     // WAP to print sum of  digits of a given number 
        int product =1;
        
        while(n!=0){
            int ld = n%10;
            if(n==0) continue;
            
            product*=ld;
            n/=10;
        }
        System.out.println(product);
    }
    
}
