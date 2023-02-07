package _02_DefiningClassesCompanyRoasterExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        List<Department> departmentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            double salary = Double.parseDouble(inputData[1]);
            String position = inputData[2];
            String departmentE = inputData[3];

            Employee employee = null;
            if(inputData.length == 4){
                 employee = new Employee(name, salary, position, departmentE);

            } else if(inputData.length == 5){
                if(Character.isDigit(inputData[4].charAt(0))){
                   int age = Integer.parseInt(inputData[4]);
                    employee = new Employee(name, salary, position, departmentE, age);
                } else {
                    String email = inputData[4];
                     employee = new Employee(name, salary, position, departmentE, email);
                }

            } else if (inputData.length == 6){
                 employee = new Employee(name, salary, position, departmentE,
                        inputData[4], Integer.parseInt(inputData[5]));
            }

            boolean departmentExist = departmentsList.stream().anyMatch(department->
                    department.getNameDepartment().equals(department));

            if (!departmentExist){
                Department department = new Department(departmentE);
                departmentsList.add(department);
            }
            Department department1 = departmentsList.stream().filter(d -> d.getNameDepartment().
                    equals(departmentE)).findFirst().get();

            department1.getEmployeeList().add(employee);
        }

        Department highestPaid = departmentsList.stream().
                max(Comparator.comparingDouble(Department::calculatedSalary)).get();

        System.out.printf("Highest Average Salary: %s%n",highestPaid.getNameDepartment());
        highestPaid.getEmployeeList().stream().
                sorted((f, s) -> Double.compare(s.getSalary(), f.getSalary()))
                .forEach(System.out::println);

    }
}
