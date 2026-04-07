package lesson5;

import java.util.Scanner;

public class Person {
    // Инкапсуляция - подход к сокрытию чего-либо (данные / реализацию / etc.)
    private String name;
    private int age;
    private Scanner in = new Scanner(System.in);

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Boilerplate - часто пишем
    // Setter - метод суть которого устанавливать значение для поля
    // Getter - метод суть которого получать значение из поля

    // entrypoint / filter / gateway
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 999) {
            System.out.println("Так нельзя!");
        }
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        while (age < 0 || age > 100) {
            System.out.println("Так нельзя!");
            age = in.nextInt();
//            System.exit(0); // Завершить работу программы
        }
        this.age = age;
    }

    // Alt + Insert

}
