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
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            firstMatrix[i] = arr;
        }

        int countSecond = dimensions[0];
        int sizeSecond = dimensions[1];

        int[][] secondMatrix = new int[countSecond][sizeSecond];

        for (int i = 0; i < countSecond ; i++) {
            int[] arr2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = arr2;
        }

        boolean areEqual = true;

        if(firstMatrix.length != secondMatrix.length){
            areEqual = false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                for (int j = 0; j < firstMatrix[i].length; j++) {
                    if (firstMatrix[i].length != secondMatrix[i].length){
                        areEqual = false;
                        break;
                    }
                    if (firstMatrix[i][j] == secondMatrix[i][j]){
                        areEqual = true;
                    } else {
                        areEqual = false;
                    }
                }
            }
        }
          if (areEqual){
              System.out.println("equal");
          } else {
              System.out.println("not equal");
          }


}
}
