// Display this Gp - 1,2,4,8,16,32......upto "n" terms
import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        int a =1,r=2;
        for(int i = 1;i<=n;i++){
            System.out.println(a+"  ");
            a*=r;
                  
        }          

    }
}
