package arrays;

public class SearchElement {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 4, 34, 56, 7};

        // Search element
        int search = 56;

        int index = -1;

        // Search for the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        // Print the result
        System.out.println(index);
    }
}