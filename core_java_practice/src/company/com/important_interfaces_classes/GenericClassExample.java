package company.com.important_interfaces_classes;

class Box<T> {
    private T value;

    //setter
    public void set(T value) {
        this.value = value;
    }

    //getter
    public T get() {
        return value;
    }
}


public class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        intBox.set(200);
        //        intBox.set("300"); // will give compilation error.. list interface is prebuild generic class

        System.out.println(intBox.get());
    }
}
