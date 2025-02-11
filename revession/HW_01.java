//  WAP to print the product of all non zero digits of  a given number 
import java.util.Scanner;
public class HW_01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
    // int product=1;
    // while(n!=0){
    //     int ld=n%10;
    //     if(ld!=0) {
    //     product*=ld;
    //     n/=10;
    //     }
    //     n/=10;

    // }
    // System.out.println(product);
    // WAP to print sumof all the even digits of a given number 
    //     int sum = 0;
        
    //     while(n!=0){

    //         int ld = n%10;
    //         if(ld%2==0){
    //         sum+=ld;
    //     }
    //     System.out.println(sum);
    //         n/=10;
    // }
    // WAP to Print reverse of a given number .

        int r = 0;
        while (n!=0){
            int ld=n%10;
            r =r*10;
            r+=ld;
            n/=10;

        }
        System.out.println(r);
  }
}
