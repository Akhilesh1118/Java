public class if_else {
    public static void main(String[] args) {
        int age =10;
        if (age >= 18) {
            System.out.println("Adult: can drive and vote");
        } else if (age > 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not an adult");
        }
    }
}