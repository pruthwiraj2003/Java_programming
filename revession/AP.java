//Display This AP -1,3,5,7...up to n
import java.util.Scanner;
public class AP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
         int n = sc.nextInt();
        // for(int i = 1;i<=2*n-1;i+=2){
        //     System.out.println("NO."+i);
        //Diplay this AP -4,7,10,13,16....
        int a=4,d=3;
        for(int i=4;i<=n;i++){
            System.out.println(a+"");
            a+=d;
            
        }

    }



}





