package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    String[] arr = {"qwe", "asd"};

    static void main() {
        // Коллекции - единое название для набора различных готовых структур данных в Java
        // List (список) - безразмерный массив
        // int[] ar = new int[100];
        // Diamond-оператор (< >)
        List<String> list = new ArrayList<>(); // array
        list.add("qwe");
        list.add("qwe");
        list.add("qwe");
        list.add("qwe"); // 5 -> new String[9]
//        list.add("asd");
//        list.remove("qwe");
//        list.contains("qwe");
//        list.get(list.size() - 1);
//        list.getLast();
//        list.getFirst();
    }
}
