

public class Numbers {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String BinoclaMoney = "минус девять триллионов девятьсот девяносто девять миллиардов девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять <= N <= девять триллионов девятьсот девяносто девять миллиардов девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять";
        String[] arr = BinoclaMoney.split(" ");
        int number = 0;
        long total = 0;
        boolean plusOrMinus = false;
        for (String i : arr) {
            switch (i) {
                case "один": number = number + 1; break;
                case "два": number = number + 2; break;
                case "три": number = number + 3; break;
                case "четыре": number = number + 4; break;
                case "пять": number = number + 5; break;
                case "шесть": number = number + 6; break;
                case "семь": number = number + 7; break;
                case "восемь": number = number + 8; break;
                case "девять": number = number + 9; break;
                case "десять": number = number + 10; break;
                case "тридцать": number = number + 30; break;
                case "сорок": number = number + 40; break;
                case "пятьдесят": number = number + 50; break;
                case "шестьдесят": number = number + 60; break;
                case "семьдесят": number = number + 70; break;
                case "восемьдесят": number = number + 80; break;
                case "девяносто": number = number + 90; break;
                case "сто": number = number + 100; break;
                case "двести": number = number + 200; break;
                case "триста": number = number + 300; break;
                case "четыреста": number = number + 400; break;
                case "пятьсот": number = number + 500; break;
                case "шестьсот": number = number + 600; break;
                case "семьсот": number = number + 700; break;
                case "восемьсот": number = number + 800; break;
                case "девятьсот": number = number + 900; break;
                case "тысяч":
                case "тысячи":
                case "тысяча":
                    total = total + number * 1000;
                    number = 0;
                    break;
                case "миллионов":
                case "миллион":
                case "миллиона":
                    total = total + number * 1000000;
                    number = 0;
                    break;
                case "миллиардов":
                case "миллиард":
                case "миллиарда":
                    total = total + number * 1000000000;
                    number = 0;
                    break;
                case "триллион":
                case "триллиона":
                case "триллионов":
                    total = total + number * 1000000000000L;
                    number = 0;
                    break;
                case "минус":
                    plusOrMinus = true;
                    break;
            }
        }

        if (plusOrMinus == true) {
            total = 0 - total;
        }

        System.out.println(total);
    }
}