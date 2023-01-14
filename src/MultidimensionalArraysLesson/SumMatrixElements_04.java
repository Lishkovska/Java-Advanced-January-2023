package MultidimensionalArraysLesson;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
               .mapToInt(Integer::parseInt).toArray();

       int rows = dimensions[0];
       int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows ; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;
        }

        int sumElements = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int current = matrix[i][j];

                sumElements += current;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumElements);
     }
    }
