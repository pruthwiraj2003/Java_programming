// print the given pattern
// ****
// ***
// **
// *
import java. util.Scanner;

public class Ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                // System.out.print("* ");
                //  System.out.print(j+ " ");
                 if(i%2!=0) System.out.print((char)(i+64)+ " ");
                else  System.out.print(i+ " ");
                
            }
            System.out.println();
            
        }
    }
    
}
