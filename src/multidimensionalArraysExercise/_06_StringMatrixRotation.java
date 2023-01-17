package multidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int rotation = Integer.parseInt(command.split("[\\(\\)]")[1]);
        int angleOfRotation = rotation % 360;

        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;

        while (!input.equals("END")) {

            if (input.length() > maxLength) {
                maxLength = input.length();
            }

            list.add(input);
            input = scanner.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() < maxLength) {
                int difference = maxLength - list.get(i).length();
                String current = list.get(i);
                list.set(i, current + (" ".repeat(difference)));
            }
        }
        int row = list.size();
        int col = maxLength;

        char[][] matrix = new char[row][col];

        for (int r = 0; r < row; r++) {
            matrix[r] = list.get(r).toCharArray();
        }
        switch (angleOfRotation) {
            case 0:
                print(matrix);
                break;
            case 90:
                for (int c = 0; c < col; c++) {
                    for (int r = row - 1; r >= 0; r--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int r = row - 1; r >= 0; r--) {
                    for (int c = col - 1; c >= 0; c--) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int c = col - 1; c >= 0; c--) {
                    for (int r = 0; r < row; r++) {
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
        }
    }

    private static void print(char[][] matrix) {
        for (char[] x : matrix) {
            for (char y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}


