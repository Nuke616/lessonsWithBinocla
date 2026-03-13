import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String halfletter = " says that Binocla loves you!";
        if (input.isEmpty() || input.contains(" ")) {
            System.out.println("What a mess!");
        } else {
            String fullletter = input.concat(halfletter);
            int lovelettersum = 0;
            for (int i = 0; i < fullletter.length(); i++) {
                lovelettersum += fullletter.charAt(i);
            }
            System.out.println(lovelettersum);
        }
    }
}

