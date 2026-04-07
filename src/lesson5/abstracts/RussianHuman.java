package lesson5.abstracts;

// Наследование
public class RussianHuman extends Human {
    private String tradition;

    void speak() {
        System.out.println("Я говорю на русском");
    }

    public String getTradition() {
        return tradition;
    }

    public void setTradition(String tradition) {
        this.tradition = tradition;
    }
}
