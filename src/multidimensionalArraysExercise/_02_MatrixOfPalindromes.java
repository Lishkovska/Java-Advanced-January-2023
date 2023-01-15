package multidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = inputArr[0];
        int cols = inputArr[1];

        String[][] palindromeMatrix = new String[rows][cols];

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols; col++) {
                char outsideLetter = (char)('a' + row);
                char insideLetter = (char)('a' + row + col) ;
                palindromeMatrix[row][col] = "" + outsideLetter + insideLetter + outsideLetter;
            }
        }

        printMatrix(palindromeMatrix);
    }

    private static void printMatrix(String[][] palindromeMatrix) {
        for (int i = 0; i < palindromeMatrix.length; i++) {
            for (int j = 0; j < palindromeMatrix[i].length; j++) {
                System.out.print(palindromeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
