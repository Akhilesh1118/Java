import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        String type;
        switch (number) {
            case 1:
                type="Monday";
                break;
            case 2:
                type="Tuesday";
                break;
            case 3:
                type="Wednesday";
                break;
            case 4:
                type="Thursday";
                break;
            case 5 : 
                type = "Friday";
                break;
            case 6 : 
                 type = "Saturday";
                 break;
            case 7 : 
                type = "Sunday";
            
            default:
                type="INVAILD INPUT ";
                break;
        }
        System.out.println(type);
        
    }
}