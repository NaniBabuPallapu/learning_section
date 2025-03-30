package company.com.others;
class Employee {
    String check = "1";
    int value11 = Integer.parseInt(check);

    public void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    @Override
    public void work(){
        System.out.println("Manager is working");
    }
    public void conductMeeting(){
        System.out.println("Manager is conduction meeting");
    }
}

class Developer extends Employee{
    @Override
    public void work(){
        System.out.println("Developer is writing code");
    }
    public void joiningMeeting(){
        System.out.println("Manager is conduction meeting");
    }
}
public class UpcastingExample {
    public static void main(String[] args) {
//        Employee employee = new Manager();
//        employee.work(); // upcasting:  calls Manager's work method. if  Manager's work method does not exist, it calls Employee's work method

        Employee[] employees = { (new Manager()), new Developer()};
        for(Employee emp : employees){
            emp.work(); // upcasting:  calls Manager's and Developer's work methods. if  Manager's work or Developer's method does not exist, it calls Employee's work method
            if(emp instanceof Manager){
                Manager manager = (Manager) emp; // downcasting : converting parent class object into child class object
                manager.work(); //
                manager.conductMeeting();
            } else if(emp instanceof Developer){
                Developer developer = (Developer) emp;
                developer.work();
                developer.joiningMeeting();
            }
            else {
                throw new ClassCastException();
            }
        }
    }
}
