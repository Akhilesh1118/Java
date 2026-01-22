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
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 15;
        int index = linearSearching(numbers, key);
        if (index == -1) {
            System.out.println("Key is not found in the list of array ");
        }else{
            System.out.println("Key found at index: " + index);
        }
    }
}
