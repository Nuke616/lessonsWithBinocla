import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("введи имя и послание согласно шаблону ниже");
            System.out.println("YourName says that Binocla loves you!");

            String input = scanner.nextLine();
            String[] words = input.split(" ");
            if (words.length == 6 &&
                    words[1].equals("says") &&
                    words[2].equals("that") &&
                    words[3].equals("Binocla") &&
                    words[4].equals("loves") &&
                    words[5].equals("you!")) {

                int summa = 0;
                for (int i = 0; i < input.length(); i++) {
                    summa += input.charAt(i);
                }
                System.out.println(summa);
            }
             else if (words.length == 5 &&
                    words[0].equals("says") &&
                    words[1].equals("that") &&
                    words[2].equals("Binocla") &&
                    words[3].equals("loves") &&
                    words[4].equals("you!")) {
                int summa = 0;
                for (int i = 0; i < input.length(); i++) {
                    summa += input.charAt(i);
                }
                System.out.println(summa);

            } else {
                System.out.println("What a mess!");
            }
        }
    }
}