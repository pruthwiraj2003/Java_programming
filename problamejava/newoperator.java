//questine - Take positive intiger input and tell if it is divisible by 5 or 3.
import java.util.Scanner ;

public class newoperator {
public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
    // System.out.println("Enter a number ");
    // int n  = sc.nextInt();
    // if(n%5==0 || n%3==0 ){
    //     System.out.println("THE NUMBER IS DIVISIBLE BY 5 OR 3");

    // }
    // else{
    //     System.out.println("The number is not divisible by any of the number ");
    // }

   // questine :Take 3 positive integer input and print the gratest of them 

   System.out.println("Enter first number : ");
   int a = sc.nextInt();
   System.out.println("Enter second number : ");
   int b = sc.nextInt();
   System.out.println("Enter third number : ");
   int c = sc.nextInt();
   if(a>b&&a>c){
    System.out.println(a+"is largest");
   }
   else if(b>a&&b>c){
    System.out.println(b+"is gratest");

   }
   else{
    System.out.println(c+"is largest");
   }
 



}






}