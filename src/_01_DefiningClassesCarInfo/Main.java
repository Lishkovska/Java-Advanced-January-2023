package _01_DefiningClassesCarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Car car = new Car();
           String[] commandParts = scanner.nextLine().split(" ");
           car.setBrand(commandParts[0]);
           car.setModel(commandParts[1]);
           car.setHorsePower(Integer.parseInt(commandParts[2]));

            System.out.println(car.carInfo());
        }
    }
}
