
// Enter cost of 3 items from the user(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;

public class threeitem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = pencil + pen + eraser;
    System.out.println("The total cost of three items is without  gst : " + total);
    float gst = total * 0.18f;
    System.out.println("The total cost of three items is with gst : " + gst);
  }
}
