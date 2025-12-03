// In a program, input 3 numbers : a,b,c. You have to output the average of these three numbers.
import java.util.*;
public class Average {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c)/3;
        System.out.println("The average of three numbers is : " + average);
    }
}
