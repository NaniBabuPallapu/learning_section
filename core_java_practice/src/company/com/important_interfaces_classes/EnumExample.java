package company.com.important_interfaces_classes;

enum Status {
    NEW("Order placed"),
    PROCESSING( "Order is being processed"),
    COMPLETED("Order completed successfully"),
    CANCELLED("Order was cancelled");

    private final String message; // Field

    // Constructor (private by default in enums)
    Status(String message) {
        this.message = message;
    }

    // Method
    public String getMessage() {
        return this.message;
    }

}

public class EnumExample {
    public static void main(String[] args) {
        Status s = Status.PROCESSING;

        System.out.println("Status: " + s);
        System.out.println("Message: " + s.getMessage());
    }
}