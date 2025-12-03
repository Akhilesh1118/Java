import java.util.*;
public class switchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String type;
        
        switch (n) {
            case 1:
                type = "One";
                break;
            case 2:
                type = "Two";
                break;
            case 3:
                type = "Three";
                break;
            default:
                type = "Other";
        }
        
        System.out.println(type);
    }
}
