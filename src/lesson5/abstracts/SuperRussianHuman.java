package lesson5.abstracts;

public class SuperRussianHuman extends RussianHuman {

    // переопределение метода
    @Override // аннотация
    void speak() {

    }

    @Override
    public String getTradition() {
        return "TEST";
    }

    @Override
    public void setTradition(String tradition) {
        super.setTradition(tradition);
    }
}
