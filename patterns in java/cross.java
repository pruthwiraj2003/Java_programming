import java.util.Scanner;
public class cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of m ");
        int m=sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==j || i+j==6) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        } 
    }
}
