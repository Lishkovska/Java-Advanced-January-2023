package setsAndMapsAdvancedLesson;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> carSet = new LinkedHashSet<>();

        while (!input.equals("END")){
            String command = input.split(", ")[0];
            String carNumber = input.split(", ")[1];
              if (command.equals("IN")){
                  carSet.add(carNumber);
              } else if (command.equals("OUT")){
                  carSet.remove(carNumber);
            }
              input = scanner.nextLine();
        }
        if (carSet.isEmpty()){
          System.out.println("Parking Lot is Empty");
        } else {
            for (String car : carSet) {
                System.out.println(car);
            }
        }
    }
}
