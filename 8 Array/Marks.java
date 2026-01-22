import java.util.*;

public class Marks {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      int marks [] = new int [50];
      marks[0] = sc.nextInt(); // phy 
      marks[1] = sc.nextInt(); // chem 
      marks[2] = sc.nextInt(); // bio 
     System.out.println("Phy marks = "+ marks[0]);
     System.out.println("Chem marks = "+ marks[1]);
     System.out.println("Math marks = "+ marks[2]);
     
     marks[2] = marks[2]+1;
     System.out.println("Math marks = "+ marks[2]);
 
    int percentage = (marks[0]+marks[1]+marks[2])/3;
    System.out.println("Percentage of the all marks you entire " + percentage);


     
    }   
}
