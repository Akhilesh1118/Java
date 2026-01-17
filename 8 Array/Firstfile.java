import java.util.*; 

public class Firstfile {
    public static void update(int arr[]){
        for(int i=0; i < arr.length; i++ ){  // Fixed: i < arr.length to avoid out-of-bounds
            arr[i] = arr[i] + 5;
        }
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);  // Removed: unused
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        update(arr);
        // String choclate[] = {"kitkat", "Dairy Milk "};  // Left as-is (commented)
        for(int i=0; i < arr.length; i++){  // Fixed: i < arr.length to avoid out-of-bounds
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
} 