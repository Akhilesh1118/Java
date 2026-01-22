public class BinarySearch {
    public static int binearySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // compariosons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right case
                start = mid + 1;
            } else { // left case
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        System.out.println("Index for key is : " + binearySearch(numbers, key));
    }
}
