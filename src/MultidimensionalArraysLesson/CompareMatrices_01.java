package MultidimensionalArraysLesson;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();

    int countOfArrays = dimensions[0];
    int sizeOfArrays = dimensions[1];

    int[][] firstMatrix = new int[countOfArrays][sizeOfArrays];

        for (int i = 0; i < countOfArrays; i++) {
            for (int j = 0; j < sizeOfArrays; j++) {
               firstMatrix[i][j] = scanner.nextInt();
            }
        }

        int countSecond = dimensions[0];
        int sizeSecond = dimensions[1];

        int[][] secondMatrix = new int[countSecond][sizeSecond];

        for (int i = 0; i < countSecond ; i++) {
            for (int j = 0; j < sizeSecond; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();


}
}
