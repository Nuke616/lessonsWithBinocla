package BinoclaBank;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CardPayment("1", -55.0);
        Payment p2 = new CryptoPayment("2 ", -55.0);
        Payment p3 = new CashPayment(null, 666.0);
        p1.process();
        p2.process();
        p3.process();


    }
}
