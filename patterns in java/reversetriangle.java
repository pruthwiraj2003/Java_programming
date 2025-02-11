import java.util.Scanner;
public class reversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        System.out.println("Enter teh value of m");
        int m =sc .nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i+j>n )System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }



    }
}
