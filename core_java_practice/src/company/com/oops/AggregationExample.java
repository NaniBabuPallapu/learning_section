package company.com.oops;

import java.util.ArrayList;
import java.util.List;

class Address {
    private String type;
    private String city;
    private String state;
    private int zipCode;

    public Address(){

    }
    public Address(String type, String city, String state, int zipCode) {
        this.type = type;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "type='" + type + '\'' +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}

class Student {
    private Long id;
    private String name;
    private List<Address> address;

    public Student(){

    }

    public Student(Long id, String name, List<Address> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddresses(List<Address> address) {
        this.address = address;
    }

    public List<Address> getAddresses() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addresses=" + address +
                '}';
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        System.out.println("=== Aggregation Example Program ===");

        List<Address> addressList = new ArrayList<>();

        Address primaryAddress = new Address();
        primaryAddress.setType("primary");
        primaryAddress.setCity("Hyderabad");
        primaryAddress.setState("Telangana");
        primaryAddress.setZipCode(500078);


        Address secondaryAddress = new Address();
        secondaryAddress.setType("secondary");
        secondaryAddress.setCity("Eluru");
        secondaryAddress.setState("Andhra Pradesh");
        secondaryAddress.setZipCode(534001);

        addressList.add(primaryAddress);
        addressList.add(secondaryAddress);


        Student student = new Student();
        student.setId(1001L);
        student.setName("Nani Babu");
        student.setAddresses(addressList);

        System.out.println(student);

    }
}
