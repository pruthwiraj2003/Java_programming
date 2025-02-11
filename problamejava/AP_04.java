// Display this arithmatic progresion - 1,3,5,7,9...upto 'n' times.//
import java.util.Scanner;
public class AP_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc. nextInt();
        // for(int i=1; i<=2*n-1;i+=2){
        //     System.out.println(i);
        // }
        // Disply this AP -4,7,10,13,16.... upto n 
        int a=4,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a+"");
            a+=d;

        }

    }
}
