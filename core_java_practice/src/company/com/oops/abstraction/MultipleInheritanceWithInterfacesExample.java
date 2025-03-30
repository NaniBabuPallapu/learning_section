package company.com.oops.abstraction;

interface ValidatePhone {
    boolean validatePhoneNumber(String phone);

    default void logPhoneValidation(String phone) {
        System.out.println("Validating Phone Number : " + phone);
    }

    static boolean checkNumeric(String phone) {
        return phone.matches("\\d+"); // ensure all characters are digit
    }
}

interface ValidateEmail {
    boolean validateEmail(String email);

    default void logEmailValidation(String email) {
        System.out.println("Validating Email : " + email);
    }

    static boolean hasValidDomain(String email) {
        return email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net");
    }
}

class ValidateServiceImpl implements ValidatePhone, ValidateEmail {

    @Override
    public boolean validatePhoneNumber(String phone) {
        logPhoneValidation(phone);
        if (phone.length() == 10 && ValidatePhone.checkNumeric(phone)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean validateEmail(String email) {
        logEmailValidation(email);
        if (email.contains("@") && ValidateEmail.hasValidDomain(email)) {
            return true;
        }
        return false;
    }
}

class Employee {
    private String email;
    private String phone;

    public Employee(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Employee() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class MultipleInheritanceWithInterfacesExample {
    public static void main(String[] args) {
        System.out.println(" === Multiple Inheritance with Interfaces ====");

        ValidateServiceImpl validateService = new ValidateServiceImpl();

        Employee employee = new Employee();

        employee.setEmail(validateService.validateEmail("nanipallapu369@gmail.com") ? "nanipallapu369@gmail.com" : null);
        employee.setPhone(validateService.validatePhoneNumber("9392590089") ? "9392590089" : null);

        System.out.println("\n");
        System.out.println("Phone Number : " + employee.getPhone() + "  and  " + "Email Address : " + employee.getEmail());
    }
}
