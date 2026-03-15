import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String BinoclaMoney = "сто миллиард один";
        String[] arr = BinoclaMoney.split(" ");
        int number2 =0;
        int total =0;
        for (String i : arr){
            switch (i) {
                case "один":
                    number2 = 1;
                   break;
                case "два":
                    number2 = 2;
                 break;
                case "три":
                    number2 = 3;
                  break;
                case "четыре":
                    number2 = 4;
                 break;
                case "пять":
                    number2 = 5;
                  break;
                case "шесть":
                    number2 = 6;
                 break;
                case "семь":
                    number2 = 7;
                 break;
                case "восемь":
                    number2 = 8;
                 break;
                case "девять":
                    number2 = 9;
                 break;
                case "десять":
                    number2 = 10;
                  break;
                case "сто":
                    number2 = 100;
                  break;
                case "миллиард":
                    number2 = 1000000000;
                    break;
            }
            total = total+number2;
        }
        System.out.println(total);
    }

}
