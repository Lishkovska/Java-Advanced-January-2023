package functionalProgramming_Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class _04_AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] pricesWithoutVat = Arrays.stream(scanner.nextLine().split(","))
                .mapToDouble(Double::parseDouble).map( price -> price * 1.2).toArray();

        System.out.println("Prices with VAT:");
        for (double price : pricesWithoutVat) {
            System.out.printf("%.2f%n", price);
        }
    }
}
