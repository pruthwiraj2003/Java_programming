//WAP to print sum of digits of a given number.//
//WAP to print the product of the given numbers
// WAP to print sum of all the even digits of a given number.
import java.util.Scanner ;

public class digitalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n =sc.nextInt();
        //  WAP to print reverse of a given number 
            // int r =0;
            // while(n!=0){
            //     int ld = n%10;
            //     r*=10;
            //     r+=ld;
            //     n/=10;
            //WAP to print the sum of given number and its reverse.
            int rev =0;
            while(n!=0){
                int ld=n%10;
                rev*=10;
                rev+=ld;
                n/=10;
                int sum =rev+n;

            }
                
            
         System.out.println(sum);
         
    }
    
}
