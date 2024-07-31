public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;

    private static int count = 1;

    Employee(String name, String position, double salary){
        setEmployeeId("EMP_" + count++);
        setName(name);
        setPosition(position);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " Name: "+ getName() + " Position: " + getPosition() + " Employee ID: " + getEmployeeId();
    }
}
