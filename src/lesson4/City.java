package lesson4;

public class City {
    String cityName;
    int population;
//    public City() { // модификатор доступа + название класса = конструктор
//        // это "особый" метод
//        // нужны для создания объектов
//        // default - пустой конструктор (public + без аргументов)
//    }
    public City(String cityName) {
        if (cityName.equals("Penza")) {
            System.out.println("Плохой город!");
        }
        this.cityName = cityName;
    }

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }


}
