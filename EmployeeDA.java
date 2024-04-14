import java.io.*;
import java.util.*;

public class EmployeeDA {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeDA(String empNo, double salary) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader("emp.csv"));


        while(scan.hasNext()) {
            String row = scan.nextLine();
            String[] rowSpecific  = new String[3];

            rowSpecific = row.split(",");

            if(empNo.equals(rowSpecific[0])) {
                employee = new Employee();

                employee.setEmpNo(rowSpecific[0]);
                employee.setLastName(rowSpecific[1].trim());
                employee.setFirstName(rowSpecific[2]);

                employee.setSalary(salary);
            }
        }
        scan.close();
    }

}