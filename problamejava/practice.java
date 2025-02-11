//Take positive intiger input and tell if it is divisible by 5 and 3 .
import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int x  = sc.nextInt();
        if(x%5==0 && x%3==0 ){
            System.out.println("The number is divisible by both 5 and 3 ");
        }
        else if(x%5==0){
            System.out.println("The Number is divisible by only 5");
        }

        else if(x%3==0){
            System.out.println("The number is divisible by only 3");

        }
            else{
                System.out.println("the number is not divisible by either of the number ");
            }
            // WAP to input  a number and tell if it is divisible by 5 but not divisible by 3 :- home work
            

        }



    }
    
  

