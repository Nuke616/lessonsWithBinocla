package lesson5.abstracts;

public class EnglishHuman extends Human {
    private int money;

    void speak() {
        System.out.println("I speak " + getNationality());
    }
}
