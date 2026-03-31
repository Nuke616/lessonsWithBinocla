package lesson4;

public class Example {
    static void main() {
        int[] ar = {1, 2, 3, 4};
        // 1)
        for (int p = 0; p < ar.length; p++) {
            System.out.print(ar[p] + " ");
        }
        System.out.println("-----");

        // 2)
        int cnt = 0;
        while (cnt < ar.length) {
            System.out.print(ar[cnt] + " ");
            cnt++;
        }
        System.out.println("-----");

        // 3)
        do {

        } while (cnt < ar.length);

        // 4)
        for (int i : ar) {
            System.out.print(i + " ");
        }

        if (cnt < 5) {

        }

        switch (cnt) {
            case 5:
                System.out.println("5");
            case 4:
                System.out.println("4");
            default:
                System.out.println("Ошибка");
        }
    }
}
