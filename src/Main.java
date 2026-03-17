import java.util.Scanner;

 //* Input: N - строка, содержащее ваше имя и следующий шаблонный текст:
        //" says that Binocla loves you!". Так, например, если Иван решит передать послание,
//он введет в консоль "Ivan says that Binocla loves you!". Имя гарантированно состоит из одного слова.
//До имени гарантированно нет пробелов. Если шаблон нарушен (например, не хватает пробела/неправильный регистр/
      //  неправильный символ/отсутствие или замена восклицательного знака) - вывести "What a mess!" (без кавычек)


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i2 = 0;
        while (i2 ==0) {
            System.out.println("Введи имя");
            String input = scanner.nextLine();
            if (input.substring(0, 1).contains(" ") || input.charAt(input.length() - 1) != ' ') {
                System.out.println("What a mess!");
            } else {
                System.out.println("Введи шаблонную фразу");
                String halfletter = scanner.nextLine(); // "says that Binocla loves you!";
                if (!halfletter.equals("says that Binocla loves you!")) {
                    System.out.println("What a mess!");
                } else {
                    String fullLetter = input + halfletter;
                    int lovelettersum = 0;
                    for (int i = 0; i < fullLetter.length(); i++) {
                        lovelettersum += fullLetter.charAt(i);
                    }
                    System.out.println(lovelettersum);
                    i2 ++;
                }
            }
        }
    }
}

