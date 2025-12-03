import java.util.*;
public class q5 {
         public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Input the year ");
            int year = sc.nextInt();
            if(year%4==0){
                System.out.println("Leap Year ");
            }else{
                System.out.println("Not a leap Year ");
            }
         }
}
