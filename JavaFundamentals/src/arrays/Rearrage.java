package arrays;

import java.util.Arrays;

public class Rearrage{
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 1};
        
        int[] result = rearrangeEvenOdd(nums);
        
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeEvenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex++;
            } else {
                result[oddIndex] = num;
                oddIndex--;
            }
        }
        return result;
    }
}