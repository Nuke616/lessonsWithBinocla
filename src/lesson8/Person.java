package lesson8;

public class Person<T> {
    private String name;
    private T t;

    public Person() {
    }

    public Person(T t) {
        this.t = t;
    }

    public Person(String name, T t) {
        this.name = name;
        this.t = t;
    }

    T getValue() {
        return t;
    }

}
