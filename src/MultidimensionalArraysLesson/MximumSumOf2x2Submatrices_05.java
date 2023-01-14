package MultidimensionalArraysLesson;

import java.util.Arrays;
import java.util.Scanner;

public class MximumSumOf2x2Submatrices_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;
        }
        int maxSum = Integer.MIN_VALUE;
        int maxSumLeftRow = 0;
        int maxSumLeftCol = 0;

        for (int i = 0; i < matrix.length -1; i++) {
            for (int j = 0; j < matrix[i].length -1; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (currentSum > maxSum){
                    maxSum = currentSum;

                    maxSumLeftRow = i;
                    maxSumLeftCol = j;
                }
            }
        }
        System.out.println(matrix[maxSumLeftRow][maxSumLeftCol] + " " +
                matrix[maxSumLeftRow][maxSumLeftCol + 1]);
        System.out.println(matrix[maxSumLeftRow + 1][maxSumLeftCol] + " " +
                matrix[maxSumLeftRow + 1][maxSumLeftCol + 1]);
        System.out.println(maxSum);



    }
    }
