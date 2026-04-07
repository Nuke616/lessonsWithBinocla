package lesson5.abstracts.examples;

// spoiler
// Мы можем имплементировать множество интерфейсов
public class MixOfDrinksInterface extends Cola implements Interface2, Interface1, Interface3 {

    @Override
    void hello() {
        // this - этот (текущий) класс
        // super - родитель
        super.hello();
    }

    @Override
    public void drink() {

    }

    @Override
    public void mix() {

    }

    @Override
    public void bill() {

    }

    @Override
    public void pay() {

    }

    @Override
    public void invite() {

    }

    @Override
    public void goodbye() {

    }
}
