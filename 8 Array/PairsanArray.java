public class PairsanArray {
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; // 2 4 6 8 10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") " );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total paris = " + tp);
    }
    public static void printSubarrays(int numbers[]){
        int ts = 0 ; 
        for(int i=0; i<numbers.length; i++){
            int start = i ;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){// print 
                    System.out.print(numbers[k] +" "); // subarray..
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray = " +ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers); 
       printSubarrays(numbers);
    }
}
