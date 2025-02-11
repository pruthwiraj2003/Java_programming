// WAP to print the given patern
import java .util.Scanner;
public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n");
        int n= sc.nextInt();
        System.out.println("Enter the value of m ");
        int m =  sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                System.out.print((char)(i+64)+ " ");

            }
            System.out.println();
        }

        
    }
    

    
}
