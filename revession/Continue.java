import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        
        // for(int i=1;i<=n;i++){
        //     if(i==14||i==27) continue;
        //     if(i%2==0 || i%3==0){
        //         System.out.println(i);
        //     }
        // }
        //WAP to print odd number 1 to 100 
        for(int i =1;i<=n;i++){
            if(i%2==0) continue;
            System.out.println("Odd no."+i);
        }
    }

    
}
