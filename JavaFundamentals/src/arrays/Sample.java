package arrays;

public class Sample {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] matrix = new int[3][3];
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(args[count]);
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                count++;
            }
        }

        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}