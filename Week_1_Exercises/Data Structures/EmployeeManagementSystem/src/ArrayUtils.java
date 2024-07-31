import java.util.Arrays;
import java.util.Objects;

public class ArrayUtils {

    public static Employee[] resizeArray(Employee[] employees, int count){
        Employee[] newEmployees = new Employee[employees.length + count];

        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        employees = newEmployees;
        return employees;
    }

    public static Employee[] add(Employee[] employees, Employee data){
        Employee[] newEmployees = resizeArray(employees, 1);
        newEmployees[newEmployees.length - 1] = data;
        employees = newEmployees;
        return employees;
    }

    public static Employee search(Employee[] employees, String searchKey){

        Employee found = null;

        for(Employee emp : employees){
            if(Objects.equals(emp.getName(), searchKey) ||
                Objects.equals(emp.getPosition(), searchKey) ||
                Objects.equals(emp.getEmployeeId(), searchKey)) {
                found = emp;
            }
        }

        return found;
    }


    public static Employee[] delete(Employee[] employees, String employeeId){
        Employee toDelete = search(employees, employeeId);
        int count = 0;
        Employee[] updated = new Employee[employees.length - 1];

        for (Employee employee : employees) {
            if (employee != toDelete) {
                updated[count] = employee;
                System.out.println(employee);
                count++;
            }
        }
        return updated;
    }


}
