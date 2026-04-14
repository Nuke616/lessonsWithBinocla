package BinoclaBank;

public class CardPayment extends Payment implements Refundable {
    public CardPayment(String id, double amount) {
        super(id, amount);
    }

    @Override
    public void process() {
        if (getAmount() < 0) {
            System.out.println("Ошибка, сумма должна быть > 0 или = 0");
        }
    }

    public boolean refund() {
        System.out.println("Могу вернуть CardPayment");
        return true;
    }
}
