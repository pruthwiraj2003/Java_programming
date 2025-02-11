// if the ages of ram,shayama and ajya are input through the keyboard,write a program to determine the youngest the three .
import java.util.Scanner;

public class newproblame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ram's age :");
        int ram = sc.nextInt(); 
        System.out.println("Enter shayam's age :");
        int shayam = sc.nextInt(); 
        System.out.println("Enter ajya's age :");
        int ajya = sc.nextInt(); 
        if(ram<shayam && ram<ajya){
            System.out.println("Ram is youngest");
        }
        else if(shayam<ram && shayam<ajya ){
            System.out.println("shayam is youngest");
        }
        else{
            System.out.println("ajya is youngest");
        }
    }
    
}
