package lesson5.abstracts.examples;

// spoiler
public class MixOfDrinks extends Cola {
    static void main() {
        MixOfDrinksInterface mixOfDrinksInterface = new MixOfDrinksInterface();
        Interface1[] interfaces = {mixOfDrinksInterface};

        for (int i = 0; i < interfaces.length; i++) {
            interfaces[i].drink(); // drink
        }
    }

    @Override
    void hello() {
        // this - этот (текущий) класс
        // super - родитель
        super.hello();
    }
}
