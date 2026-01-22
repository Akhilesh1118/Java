public class LargestArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        System.out.println("Smallest value is :  " + smallest);

        // Return largest value ..
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 23, 45, 67, 89, 100, 90, 34 };
        System.out.println("Largest element in array = " + getLargest(numbers));

    }
}
