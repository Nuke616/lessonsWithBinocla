package BinoclaBank;

public class CryptoPayment extends Payment implements Refundable {
    public CryptoPayment(String id, double amount) {
        super(id, amount);
    }

    @Override
    public boolean refund() {
        System.out.println("Могу вернуть CryptoPayment");
        return true;
    }

    @Override
    public void process() {
        if (getId().contains(" ")) {
            System.out.println("id содержит пробелы");
        }
    }
}
