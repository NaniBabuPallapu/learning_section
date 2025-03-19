package company.com.oops;

class Employee {
    private int empId;
    private String name;
    private double salary;
    private boolean active;

    public Employee() {

    }

    public Employee(int empId, String name, double salary, boolean active) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.active = active;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Employee = {" +
                " empId = " + empId +
                ", name = " + name + '\'' +
                ", salary = " + salary +
                ", active = " + active +
                "}";
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        System.out.println("Method Started");
        Employee employee = new Employee();
        employee.setEmpId(123);
        employee.setName("Nani");
        employee.setSalary(75000.00);
        employee.setActive(true);
        System.out.println(employee);

        Employee employee1  = new Employee(1002, "Priyanka", 50000.0, false);
        System.out.println(employee1);

    }
}
