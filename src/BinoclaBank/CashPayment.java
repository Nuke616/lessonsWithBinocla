package BinoclaBank;

public class CashPayment extends Payment implements Refundable {
    public CashPayment(String id, double amount) {
        super(id, amount);
    }

    @Override
    public void process() {
        // if (1 -> 2 -> 3)
        // "   " <- blank
        // "" <- blank
        if (getId() == null || getId().contains(" ")) {
            System.out.println("id содержит пробелы или содержит null");
        }
    }

    @Override
    public boolean refund() {
        System.out.println("Не могу вернуть CashPayment");
        return false;
    }
}
