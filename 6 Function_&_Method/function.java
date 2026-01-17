import java.util.*; 

public class function {
        public static int factorial(int n){
            int f = 1; 
            for(int i=1; i<=n; i++){
                    f= f*i;
            }
            return f;
        } 
        public static int binCoeff(int n , int r){
              int fact_n = factorial(n);
              int fact_r = factorial(r);
              int fact_n_minus_r = factorial(n-r);
              
              int binoCoeff = fact_n / (fact_r *  fact_n_minus_r);
              return binoCoeff;
            }
        // function to calc sum of 2 nums 
        public static int sumoftwo (int a , int b ){
                return a + b; 
        }
        // function to calc sum of 3   nums 
        public static int sum (int a, int b, int c ){
                return a + b + c ;
        }
           // using data types 
        
        public static int sum (int a , int b ){
                return a +b;
        }
        public static float sum (float a, float b){
                return a+b;
        }
        
        // public static boolean isPrime(int n){
        //         // corner case 
        //         if (n%2== 0 ) {
        //                 return true;
        //         }
        //         boolean isPrime = true;
        //         for(int i=2; i<=n-1; i++){
        //                 if (n%i == 0) {
        //                         isPrime = false;
        //                         break ;
        //                 }
        //         }
        //         return isPrime;
        // }
               // optimazing solution 

        public static boolean isPrime(int n){
                  if (n==2 ) {
                        return true;
                }
                for(int i=2; i<=Math.sqrt(n); i++){
                        if (n % i == 0) {
                                return false;
                        }
                }
                return true;
        }

        public static void primesInRange(int n ){
                for(int i=2; i<=n; i++){
                        if (isPrime(i)) { // true 
                                System.out.print(i+" ");
                        }
                }
                System.out.println();
        } 
        // Convert  binary to Decimal  
           public static void binToDec(int binNum){
                int MyNum= binNum;
                int pow = 0;
                int decNum = 0;
                while(binNum > 0){
                        int lastDigit = binNum % 10 ;
                        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

                        pow++;
                        binNum = binNum/10;

                }
                System.out.println("Decimal of " + MyNum + " = " + decNum);
           }
        
        public static void DeciTobin(int n ){
                int MyNum = n;
                int pow = 0;
                int binNum = 0;

                while (n > 0) {
                        int rem = n %2;
                        binNum = binNum+(rem * (int)Math.pow(10,pow));

                        pow++;
                        n= n/2;
                }
                System.out.println("Decimal of "+ MyNum + " = " + binNum);
                
        }
        public static void main (String  args[]){

        //    int n = 5 ;       
        //    System.out.println(factorial(n));
        //    System.out.println(binCoeff(5, 2));
        //    System.out.println("Sum of two number =" +sumoftwo(10, 89));
        //    System.out.println("Sum of three number =" + sum(12, 12, 12));
        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.2f, 5.6f));
        // }    
        // System.out.println(isPrime(16));
        primesInRange(100);
        // binToDec(1010);
        // DeciTobin(15);
}
}
