// print table of n here n uis an intiger which user will input .abstract 
import java .util.Scanner;

public class table_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=1;i<=10;i+=1){
            
            System.out.println(n+"x"+i+"="+i*n);
        }

    }

}
