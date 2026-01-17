
public class Solution {
    public static double average(double a,double b , double c){
                  return (a+b+c)/3;
                  
    } 
    


    public static boolean isEven(int n){

         if (n%2 == 0) {
           return  true;
         }else{

             return false;
         }
    }

    public static boolean ispalindrom(int number){
           int palindrom = number;
           int reverse = 0 ;

           while (palindrom !=0 ) {
              int remainder = palindrom %10;
              reverse = reverse *10 +remainder;
              palindrom = palindrom /10;
           }
            if (number == reverse) {
                return true;
            }
            return false;
    }

    public static  int sumOfinterger(int number){
        int mynumber = number;
        int sum = 0;
        while(mynumber > 0){
            int lastDigit = mynumber %10;
            sum += lastDigit;
            mynumber = mynumber/10;
        }
        return sum ;
    }

        public static void main (String args[]){
            // solution 1 
            System.out.println("The average value is " + average(50, 90, 100));
            
            // Solution 2 

            if(isEven(50)){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd ");
            }
            
            // solution 3 
            int palindrom = 125;
            if (ispalindrom(palindrom)) {
                System.out.println("Number :" + palindrom + "is a palindrome");
            }else{
                System.out.println("Number : " + palindrom + " is not a palindrome ");
            }

            // Question 5 
            int number = 123456789;
            System.out.println("The sum of  "+ number + " = " +sumOfinterger(number));
        }    
}

