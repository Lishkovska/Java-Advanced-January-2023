package MultidimensionalArraysLesson;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countArrays = Integer.parseInt(scanner.nextLine());
        int sizeArrays = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[countArrays][sizeArrays];
        char[][] secondMatrix = new char[countArrays][sizeArrays];

        for (int i = 0; i < countArrays; i++) {
            char[] a = scanner.nextLine().toCharArray();
            firstMatrix[i] = a;
        }

        for (int i = 0; i < countArrays; i++) {
            char[] b = scanner.nextLine().toCharArray();
            secondMatrix[i] = b;
        }
        char[][] newMatrix = new char[countArrays][sizeArrays];
        for (int i = 0; i < firstMatrix.length ; i++) {
            char[] first = firstMatrix[0];
            char[] second = secondMatrix[0];
            for (int j = 0; j < first.length; j++) {
                char firstSymbol = first[j];
                char secondSymbol = second[j];
                
                if (firstSymbol != secondSymbol && firstSymbol != '*' && secondSymbol != '*'){
                    newMatrix[i][j] = '*';
                } else {
                   newMatrix[i][j] = firstSymbol;
                }
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
      }
    }
