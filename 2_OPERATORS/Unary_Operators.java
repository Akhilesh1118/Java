public class Unary_Operators {
    public static void main (String args[]){
        int a = 10;
        int b = a++; // +1 10  Post Increment 
        int c = ++a; //  Pre Increment +1 12 then store the value in a = 12 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
