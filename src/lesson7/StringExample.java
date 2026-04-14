package lesson7;

import java.util.Scanner;

/*
    Дана строка (слово). Нужно посчитать кол-во символов a-z
 */
public class StringExample {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println((int) 'a');
        System.out.println((int) 'z');
        String s = in.next();
        variant1(s);
        variant2(s);
        variant3(s);
        variant4(s);
        variant5(s);
    }

    private static void variant1(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void variant2(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void variant3(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            String x = s.charAt(i) + ""; // char + string = string
            // 'a', "a"
            // s.contains("abcedfrtg")
            if ("abcdefgxpio".contains(x)) { // перечисляем от a-z
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    // RegEx
    private static void variant4(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            String x = s.charAt(i) + ""; // char + string = string
            if (x.matches("a-z")) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }


    // Steam API
    private static void variant5(String s) {
        final int[] cnt = {0};
        s.chars()
                .peek(x -> {
                    if (x >= 'a' && x <= 'z') {
                        cnt[0]++;
                    }
                }).forEach(e -> System.out.println(cnt[0]));
    }
}
