package lesson5.abstracts;

// Другая "сущность"
// Interface - no constructor
// все поля - константы (public + final)
public interface HumanAction {
    String name = null;

    void run();
}
