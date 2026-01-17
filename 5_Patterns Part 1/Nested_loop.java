import java.util.*;
public class Nested_loop{
    public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter line number : ");
         int i = sc.nextInt();
        for(int line=1; line<=i; line++){
            for(int start = 1; start <= line ; start++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}