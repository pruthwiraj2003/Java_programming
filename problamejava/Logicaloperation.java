import java.util.Scanner;

public class Logicaloperation {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter a number : ");
    int n =sc. nextInt();
    // if(n>99 && n<1000){
    //     System.out.println("This is a three digit NUmber ");

    // }
    // else{
    //     System.out.println("This is not a three digit number ");

    // }

        if (n>10 && n<100){
            System.out.println("This is a two digit number ");

            
        }
        else{

            System.out.println("This is not a two digit number ");
        }

    }



}
