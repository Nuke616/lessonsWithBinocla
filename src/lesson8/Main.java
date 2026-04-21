package lesson8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> list1 = new ArrayList<>();
        list1.add("qw");

        List<Integer> list2 = new ArrayList<>();
        list2.add(123);

        String s1 = getFirst(list1);
        int num = getFirst(list2);

        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> doubles = List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8);
        List<BigInteger> qwe = List.of(new  BigInteger("10"), new BigInteger("20"), new BigInteger("30"), new BigInteger("40"));

        double sum1 = setNumbers(ints);
        double sum2 = setNumbers(doubles);

        List<Object> q1 = new ArrayList<>();
        List<Number> q2 = new ArrayList<>();
        q2.getFirst();
        addNumbers(q1);
        addNumbers(q2);

        List<Integer> source = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Number> destination1 = new ArrayList<>();
        List<Object> destination2 = new ArrayList<>();

        copy(source, destination1);
        copy(source, destination2);

        // ? versus T
        // 1) ? ~ Object (invariant)
        // 2) covariant (extends) / contravariant (super)

        // T какой-то конкретный тип который передали / объявили

        Person p = new Person(); // Object
        Person<String> p1 = new Person("qwe");
        System.out.println(p1.getValue());
        Person<Integer> p2 = new Person();
    }

    public static <T> T getFirst(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    public static double setNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Number> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static <T> List<? super T> copy(List<? extends T> source, List<? super T> target) {
        for (T item : source) {
            target.add(item);
        }
        return target;
    }
}
