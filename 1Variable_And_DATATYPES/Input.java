import java.util.*;
public class Input {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine() ;
    // sum of A & B with the help of uesr input 
    System.out.println("Your name is : "  + name );          
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b ; 
    System.out.println("Sum of A and B is =  : "  + sum  );  
    // System.out.println("Multiplication  of A and B is =  : "  + sum );  
    int mul = a * b ; 
    System.out.println("Multiplication  of A and B is =  : "  + mul );

    }

}



                