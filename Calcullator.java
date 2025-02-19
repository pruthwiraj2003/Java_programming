// Take input from user till user does not press X or x
import java.util.Scanner;
public class Calcullator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int ans =0;
        while(true){
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            if(op=='+'||op =='-'||op =='*'||op=='%'||op=='/'){
                System.out.println("Enter two Nimber:");
                int num1 =in.nextInt();
                int num2 =in.nextInt();
                if(op=='+'){
                    ans =num1+num2;

                }
                if(op=='-'){
                    ans =num1-num2;
                    
                }
                if(op=='*'){
                    ans =num1*num2;
                    
                }
                if(op=='/'){
                    if(num2!=0)
                    ans =num1/num2;
                    
                }
                if(op=='%'){
                    ans =num1%num2;
                    
                }
                else if (op =='x'|| op == 'X'){
                    System.out.println("Thanks for visiting ");
                    break;
                }
                else{
                    System.out.println("Invalid Operation");
                }
            }
            System.out.println("Your answer is " +ans);
        }

        
    }
    
}
