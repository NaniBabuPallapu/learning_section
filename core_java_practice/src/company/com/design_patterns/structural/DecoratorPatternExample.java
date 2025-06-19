package company.com.design_patterns.structural;

interface Notification {
    void send(String message);
}

class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}

class NotificationDecorator implements Notification {
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
    }
}

class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Send basic notification first
        System.out.println("Sending SMS notification: " + message);  // Add SMS functionality
    }
}

class EmailNotification extends NotificationDecorator {
    public EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Send basic notification first
        System.out.println("Sending Email notification: " + message);  // Add Email functionality
    }
}


public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();  // Basic notification

        // Add SMS functionality to the notification
        notification = new SMSNotification(notification);

        // Add Email functionality to the notification
        notification = new EmailNotification(notification);

        // Final notification that now includes SMS and Email
        notification.send("Hello, this is a test message!");
    }
}

