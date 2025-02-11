// if the ages of Ram,Shyam and  Ajaya are input thrugh the keyboard,write aprogram to determine the youngest of the three .

import java. util.Scanner;


public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram's age ");
        int Ram = sc.nextInt();
        System.out.println("Enter Shyam's age ");
        int Shyam = sc.nextInt();
        System.out.println("Enter Ajaya's age ");
        int Ajaya = sc.nextInt();
        
        if (Ram<Shyam){
            if(Ram<Ajaya){
                System.out.println("Ram is youngest ");
            }
            else{
                System.out.println(Ajaya+"is youngest ");
            }
            if  (Shyam<Ajaya){
                System.out.println(Shyam+"is youngest ");
            }
            else{
                System.out.println(Ajaya+"is youngest");
            }
        }
        
       


    }
    
}
