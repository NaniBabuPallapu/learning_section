package company.com.important_interfaces_classes.clonable_interface;

import javax.swing.plaf.synth.SynthUI;

class Person implements Cloneable {
    private String name;
    private OfficeAddress address;

    public Person(String name, OfficeAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OfficeAddress getAddress() {
        return address;
    }

    public void setAddress(OfficeAddress address) {
        this.address = address;
    }

    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.address = address.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class OfficeAddress implements Cloneable {
    String city;

    public OfficeAddress(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public OfficeAddress clone() throws CloneNotSupportedException {
        return (OfficeAddress) super.clone();
    }

    @Override
    public String toString() {
        return "OfficeAddress{" +
                "city='" + city + '\'' +
                '}';
    }
}

public class DeepCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create an OfficeAddress object
        OfficeAddress officeAddress = new OfficeAddress("Hyderabad");

        // Create a Person object with the above OfficeAddress
        Person person1 = new Person("Nani", officeAddress);

        // Perform a deep clone of person1
        // This will clone the Person and also clone the OfficeAddress inside it
        Person person2 = person1.clone();

        // Now modify the city of person2's OfficeAddress
        // Since person2 has a deep copy of the OfficeAddress,
        // this change will NOT affect person1's address
        person2.getAddress().setCity("Vijayawada");

        // Print both person1 and person2 to verify deep cloning
        // person1's address remains "Hyderabad"
        // person2's address becomes "Vijayawada"
        System.out.println(person1); // Output: city='Hyderabad'
        System.out.println(person2); // Output: city='Vijayawada'

    }
}
