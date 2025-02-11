import java.util.Scanner;

public class Example {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of the rectangle :");
    int L = sc.nextInt();
    System.out.println("Enter breath of the rectangle :");
    int B = sc.nextInt();
    int area=L*B;
    int perimeter = 2*(L+B);
    System.out.println( area=L*B);
    System.out.println( perimeter=2*(L+B));

   if(area>perimeter){
System.out.println("area is grater thn the perimeter :");
   }
   else if(perimeter>area){
      System.out.println("perimeter  is grater the area ");

   }
    else{
      System.out.println("peremeter is equal to area ");

    }
   
    


} 
    

    
}
