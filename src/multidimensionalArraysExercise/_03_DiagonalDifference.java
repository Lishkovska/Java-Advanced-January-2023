package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;
        }
       int firstDiagonal;
        int sumFirstDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            firstDiagonal = matrix[i][i];
            sumFirstDiagonal += firstDiagonal;
        }
        int secondDiagonal;
        int sumSecondDiagonal = 0;
        for (int row = matrix.length - 1, col = 0; col < matrix.length ; row-- , col++){
            secondDiagonal = matrix[row][col];
            sumSecondDiagonal += secondDiagonal;
        }
        int difference = Math.abs(sumFirstDiagonal - sumSecondDiagonal);
        System.out.println(difference);
    }
}
