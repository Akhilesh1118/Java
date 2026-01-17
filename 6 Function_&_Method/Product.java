import java.util.*;
public class Product {
    public static int  multiple(int a, int b ){
        int mul = a*b;
        return mul ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Value a : ");
        int a = sc.nextInt();
        System.out.print("ENter Value b : ");
        int b = sc.nextInt();
        int multipl =  multiple(a ,  b );
        System.out.println("Multiple of a &b : " + multipl);
    }
}
  