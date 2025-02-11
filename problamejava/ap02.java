// problame 02 : - Display this AP - 4,7 ,10,13,16...up to 'n' terms 
import java.util.Scanner;
public class ap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
         int n = sc.nextInt();
        // for(int i = 4; i<=3*n+1;i+=3){
        //     System.out.println(i);
        // }

        int a =4,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a+"");
            a+=d;
        }

    }
}
     