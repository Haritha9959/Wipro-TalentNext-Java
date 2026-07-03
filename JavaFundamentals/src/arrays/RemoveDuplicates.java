package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {12, 34, 12, 45, 67, 89};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : input) {
            set.add(num);
        }
        
        System.out.print("{");
        int count = 0;
        for (int num : set) {
            System.out.print(num);
            if (count < set.size() - 1) {
                System.out.print(",");
            }
            count++;
        }
        System.out.println("}");
    }
}