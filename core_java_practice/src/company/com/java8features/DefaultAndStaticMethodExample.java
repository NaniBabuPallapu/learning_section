package company.com.java8features;

import java.util.ArrayList;
import java.util.List;

class User {
    private int id;
    private String username;
    private String email;
    private String phoneNumber;

    public User() {
    }

    public User(int id, String username, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

@FunctionalInterface
interface UserService {
    void registerUser(User user);

    default boolean isValidEmail(String email) {
        if (!email.isBlank() && email.contains("@gmail.com")) {
            return true;
        }
        System.out.println(email + " is invalid email ");
        return false;
    }

    default boolean isValidPhone(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            return true;
        }
        System.out.println(phoneNumber + " is invalid phone number");
        return false;
    }

    static boolean logIn(String username, String phone) {
        if (username != null && phone != null && !username.isBlank() && !phone.isBlank()) {
            return true;
        }
        System.out.println("LogIn Failed :" + username);
        return false;
    }
}

class UserServiceImpl implements UserService {

    @Override
    public void registerUser(User user) {
        if (isValidEmail(user.getEmail()) && isValidPhone(user.getPhoneNumber())) {
            System.out.println("User has been registered " + user);
        }
    }
}

public class DefaultAndStaticMethodExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User(1, "Nani Babu", "nanipallapu369@gmail.com", "9392590080"));
        userList.add(new User(2, "Kumar", "kumar@", "9392590080"));
        userList.add(new User(3, "Swathi", "swathi@gmail.com", "9876543210"));
        userList.add(new User(4, "Ravi", "ravi@yahoo.com", "9988776655"));
        userList.add(new User(5, "Divya", "divya@gmail.com", "912345678"));
        userList.add(new User(6, "Rajesh", "rajesh@gmail.com", ""));


        UserService userService = new UserServiceImpl();
        for (User user : userList) {
            if (UserService.logIn(user.getUsername(), user.getPhoneNumber())) {
                userService.registerUser(user);
            }
            System.out.println("\n");
        }

    }
}
