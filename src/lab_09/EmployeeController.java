package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {
    public int caculateTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee emp1 = new FTE();
        Employee emp2 = new Contractor();
        List<Employee> employeeList = Arrays.asList(emp1, emp2);

        EmployeeController controller = new EmployeeController();
        controller.caculateTotalSalary(employeeList);

    }
}
