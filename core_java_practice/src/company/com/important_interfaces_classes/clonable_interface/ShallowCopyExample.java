package company.com.important_interfaces_classes.clonable_interface;

class Address {
    private String city;
    private String state;

    public Address() {
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

class Customer implements Cloneable {
    private int id;
    private String name;
    private char gender;
    private Address address;

    public Customer() {

    }

    public Customer(int id, String name, char gender, Address address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating an Address object and assigning it to a Customer
        Address address1 = new Address("Vijayawada", "Andhra Pradesh");
        Customer customer1 = new Customer(1, "Nani", 'M', address1);

        // Performing a shallow clone of customer1
        // This means all primitive and immutable fields are copied as values
        // but mutable objects (like Address) are copied as references
        Customer customer2 = customer1.clone();

        // Updating name in customer2 (primitive/immutable -> independent change)
        customer2.setName("Babu");

        // Modifying the Address object using customer2 reference
        // Since Address is a shared reference (shallow copy), changes affect both customer1 and customer2
        customer2.getAddress().setCity("Hyderabad");
        customer2.getAddress().setState("Telangana");

        // Output: both customers now show the same modified address
        // Because the Address object was not deeply cloned (new object), it is shared
        // above I updated clone object. but you see that original object also got updated.
        System.out.println(customer1); //Customer{id=1, name='Nani', gender=M, address=Address{city='Hyderabad', state='Telangana'}}
        System.out.println(customer2); //Customer{id=1, name='Babu', gender=M, address=Address{city='Hyderabad', state='Telangana'}}


    }
}
