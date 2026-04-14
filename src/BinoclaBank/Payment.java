package BinoclaBank;

public abstract class Payment {
    private final String id;
    private double amount;
    private String status;

    public Payment(String id, double amount) {
        this.id = id;
        this.amount = amount;
        status = "Создан";
    }

    public String getId() {
        return id;
    }

    public abstract void process();

    public void cancel() {
        status = "ОТМЕНЕН";
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
