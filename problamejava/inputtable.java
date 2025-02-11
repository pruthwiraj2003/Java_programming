//HW: print the table of n. here n is an intiger which user will input 
import java.util.Scanner;
public class inputtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.print("Table of");
        for(int i=1;i<=10 ;i++){
            System.out.println(+n+ "x" +i+  "=" +(n*i));
           
            
        }

    }
}
