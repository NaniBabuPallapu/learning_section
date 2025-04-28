package company.com.collections_programs;

import java.util.*;

class Employee {
    private String name;
    private String email;
    private Long phone;

    public Employee(String name, String email, Long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (this == object) {
            return true;
        }
        Employee employee = (Employee) object;
//        return this.name.equals(employee.getName()) && this.email.equals(employee.getEmail()) && this.phone == employee.phone;// if phone is primitive data type
        return this.name.equals(employee.getName()) && this.email.equals(employee.getEmail()) && this.phone.equals(employee.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class RemoveDuplicateObjects {
    public static void main(String[] args) {
        // Creating sample employee objects
        Employee emp1 = new Employee("John Doe", "john@example.com", 123456789L);
        Employee emp2 = new Employee("John Doe", "john@example.com", 123456789L);
        Employee emp3 = new Employee("Jane Smith", "jane@example.com", 987654321L);

        // Option 1: TreeSet using phone number to compare
        // Duplicates are avoided based only on phone field (Comparator logic)
//        Set<Employee> employeeSet = new TreeSet<>(Comparator.comparing(Employee::getPhone));

        // Option 2: HashSet requires equals() and hashCode() for proper duplicate detection
        Set<Employee> employeeSet = new HashSet<>();

        // Adding employees
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        // Printing the set to check for duplicates
        employeeSet.forEach(emp -> System.out.println(emp + " | HashCode: " + emp.hashCode()));
    }
}
