import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Введите текст, а если хочешь выйти нажми exit");
            input = scanner.nextLine().replace(" ", "").toLowerCase();

            if (input.equals("exit")) {
                System.out.println("До свидания!");
                break;
            }

            boolean palindrom = false;

            for (int i = 0; i < input.length(); i++) {
                char left = input.charAt(i);
                char right = input.charAt(input.length() - 1 - i);
                if (left == right) {
                    palindrom = true;

                }
                else if (left != right){
                    palindrom = false;
                }
            }
            if (!palindrom) {
                System.out.println("Не палиндромчик сорян");

            }
            else {
                System.out.println("Палиндромчик вошел в чат!");
            }

        } while (true);
    }
}