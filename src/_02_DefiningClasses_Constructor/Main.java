package _02_DefiningClasses_Constructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input.length == 1){
                Car car = new Car(input[0]);
                System.out.println(car);
            } else {
                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));
                System.out.println(car);
            }
        }
    }
}
