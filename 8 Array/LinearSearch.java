public class LinearSearch {
    public static int linearSearching(int numbers[] , int key){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            if(numbers[i] == key){
                return i ;
            }
        }
        return - 1;
    }
     // Array using String data types . 
    public static String linearSearchingString(String words[] , String key){
        int n = words.length;
        for(int i=0; i<n; i++){
            if(words[i] == key ){
                return words[i] ;
            }
        }
        return "Not Found";
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 20;
        int index = linearSearching(numbers, key); // Time complexity  wors case = O(n)
        
        if (index == -1) {
            System.out.println("Key is not found in the list of array ");
        }else{
            System.out.println("Key found at index: " + index);
        }
                 // Using String Data types ... 
        String words[] = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String Key = "apple";
        System.out.println(linearSearchingString(words, Key));
    }
}
