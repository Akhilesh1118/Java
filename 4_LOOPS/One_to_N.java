import java.util.*;
public class One_to_N {
     public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number  where  can can start to print  it : ");
        int number  = sc.nextInt();
        System.out.print("Enter the last number :  ");
        int last = sc.nextInt();
        System.out.println("Please wait a minute Print the give number : ");
        while(number <=  last ){
             System.out.print(number+" ");
             number++;
        } 
        System.out.println();
     }
}
