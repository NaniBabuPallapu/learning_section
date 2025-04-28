package company.com.collections;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class JavaHashCodeExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Nani",80000);
        Employee employee2 = new Employee(101,"Priyanka",45000);

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        Map<Integer, Employee> map = new HashMap<>();
        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);

        int searchId = 101;
        Employee found = map.get(searchId);

        if (found != null) {
            System.out.println("Employee found: " + found.getId());
        } else {
            System.out.println("Employee not found with id: " + searchId);
        }

    }
}
