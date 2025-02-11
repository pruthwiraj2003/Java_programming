//Take three input and tell if they can be the side of triangle .
import java.util.Scanner;

public class Sideoftriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter side 'A' of a triang ");
    int A = sc.nextInt();
    System.out.println("Enter side 'B' of a triang ");
    int B = sc.nextInt();
    System.out.println("Enter side 'C' of a triang ");
    int C = sc.nextInt();
    
    
    if((A+B)>C &&(B+C)>A && (C+A)>B ){
        System.out.println("It is a triangle"); 
    }
   
    
    else{
        System.out.println("It is not a triangle ");
    } 
    }
    
}
    

