import java.util.Scanner;
public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        long fact = 1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    
}
