import java.util.*;
public class first {
    public static void printHelloWorld() {
        System.out.println("Hello World ... ");
        System.out.println("Calling function ");
    }
    public static  int subtact(int a , int b ){
        return a-b;
    }
    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is :  " + sum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("enter number a :");    
         int a = sc.nextInt();
         System.out.print("enter number b : ");    
         int b = sc.nextInt();

         System.out.println("subtract  of a - b : " + subtact(a, b));
         calculateSum(a, b);    


        // printHelloWorld(); // function call 
    
    }
    
}
   