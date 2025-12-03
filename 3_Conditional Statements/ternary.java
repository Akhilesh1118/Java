import java.util.*;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String type = (n%2 == 0) ? "even" : "odd";
        String type = (n >= 33 && n <= 100 ) ? "Pass" : "fail";
        System.out.println(type);
    }
}
