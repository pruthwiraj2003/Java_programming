import java.util.Scanner;

public class nastedquestine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a= sc.nextInt();
        System.out.println("enter second  number ");
        int b= sc.nextInt();
        System.out.println("enter third  number ");
        int c= sc.nextInt();
        // a=3 b=2 c=5 

        if (a>b){
            if(a>c){
                System.out.println("a is largest ");
            }
            else{
                System.out.println(c+"is largest ");
            }
            if  (b>c){
            }
            else{
                System.out.println(c+"is largest");
            }
        }

    }
    
}
