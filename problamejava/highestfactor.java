  // WAP to find the highest factor of a number 'n'(other than itself)//
import java.util.Scanner;

public class highestfactor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int hf=1;
        for(int i=n-1;i>1;i-=1){
            if(n%i==0){
            hf=i;
            break;
            }
        }
        System.out.println(hf);

    }
}
