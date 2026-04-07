package lesson5.abstracts;

// abstract
// Класс является абстрактным тогда и только тогда, когда у него хотя бы 1 абстрактный метод
public abstract class Human {
    private String skinColor;
    private String name;
    private int age;
    private String nationality;

//    public Human(String skinColor, String name, int age, String nationality) {
//        this.skinColor = skinColor;
//        this.name = name;
//        this.age = age;
//        this.nationality = nationality;
//    }

    void walk() { // будет у всех по дефолту
        System.out.println("Я хожу!");
    }

    abstract void speak(); // его реализация варьируется от человека к человеку

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
