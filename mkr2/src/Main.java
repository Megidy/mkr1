import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int[][] array = new int[rows][cols];

        Random rand = new Random();

        System.out.println("2d array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextInt(9) + 1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nsum of every column:");
        int[] colSums = new int[cols];

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += array[i][j];
            }
            colSums[j] = sum;
            System.out.println("row " + (j + 1) + ": " + sum);
        }

        int minSum = colSums[0];
        for (int j = 1; j < cols; j++) {
            if (colSums[j] < minSum) {
                minSum = colSums[j];
            }
        }

        System.out.println("\nsmallest sum of all column: " + minSum);
    }
}
