// input length,breadth,sqare or not.
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter lenth");
        int length = sc.nextInt();
        
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        
    
        if(length==breadth){
            System.out.println("it is a square");
        }
        else{
            System.out.println("it is not square ");

        }




    } 
    


    
}
