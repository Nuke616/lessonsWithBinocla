package lesson4;

public class Person {
    public static String name = "Sergey"; // константа
    public int age; // 0

    static void main(String[] args) {
        name = "Binocla";
        String name = "Hello";
//        Person person = new Person();
//        person.age;
//        this.age = 2;
        System.out.println(Person.name); // this -> ссылает на поле текущего объекта (дай мне что-то из ДАННОГО (объекта)) -> non-static
        test1();
        System.out.println(name);
    }

    static void test1() {
        name = "Test";
    }
}
