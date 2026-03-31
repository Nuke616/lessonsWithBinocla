package lesson4;

public class CityExample {
    static void main() {
        City city = new City("Qwe"); // создаем объект
        city.cityName = "Moscow"; // обращение к полю
        System.out.println(city.cityName); // вывод

        City city2 = new City("Penza");
        City city3 = new City("Penza", 100);
    }
}
