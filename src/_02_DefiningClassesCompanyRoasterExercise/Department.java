package _02_DefiningClassesCompanyRoasterExercise;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameDepartment;
    List<Employee> employeeList;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        employeeList = new ArrayList<>();
    }

    public Double calculatedSalary(){
        return this.employeeList.stream().mapToDouble(Employee::getSalary)
                .average().orElse(0);
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
