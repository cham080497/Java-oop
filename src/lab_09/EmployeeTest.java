package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new FTE();
        emp1.setName("Minh Duc");
        emp1.setSalary(50000);
        Employee emp2 = new Contractor();
        emp2.setName("Lisa");
        emp2.setSalary(40000);
        Employee emp3 = new FTE();
        emp3.setName("Duong Giang");
        emp3.setSalary(50000);
        List<Employee> employeeList= Arrays.asList(emp1, emp2, emp3);

        int totalSalary = new EmployeeController().caculateTotalSalary(employeeList);
        System.out.println("Total: " + totalSalary);

    }
}
