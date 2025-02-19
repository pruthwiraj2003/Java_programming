import java.util.Scanner;
public class countnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =in.nextInt();
        int count =0;
        while(n>0){
            int rem =n%10;
            if(rem==5){
                int add = 0+rem;
            
                count++;

            }  
            n=n/10;

        }
        System.out.println(count);
    }
}
