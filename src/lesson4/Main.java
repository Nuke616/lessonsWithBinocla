package lesson4;

import java.util.Arrays;

// поля
// конструктора
// method arguments (все что передается в аргументы метода - копируется) [x]
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = "Sergey";
        StringBuilder s1 = new StringBuilder();
        s1.append("Sergey"); // мы НЕ создаем новый StringBuilder -> final выполняется
        int num1 = 100;
        changeArray(arr);
        changeInt(num1); // копия (this.num = 100)
        changeString(s);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println(num1);
        System.out.println(s);
    }

    static void changeArray(int[] arr) {
        arr[0] = 999;
    }

    static void changeString(String s) {
        // s = "Sergey"
        s = s + "Hello"; // копия новой строки
//        String s1 = new String(s) + "Hello";
        System.out.println(s);
    }

    static void changeInt(int number2) {
        number2 = number2 * 100;
        System.out.println(number2); // number тут НЕ то же самое, что number в main(String[] args)
    }

    // mutable / immutable
    // mutable - объект видоизменяемый
    // immutable - достигается с помощью keyword "final" + создается НОВАЯ "версия" при любом изменении final объекта
}
