package arrays;

public class MinMaxArray {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {25, 10, 45, 5, 30, 60, 15};

        // Assume first element is maximum and minimum
        int max = arr[0];
        int min = arr[0];

        // Find maximum and minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Display the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}