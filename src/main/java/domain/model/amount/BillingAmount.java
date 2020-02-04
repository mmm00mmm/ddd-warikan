package domain.model.amount;

/**
 * 請求金額
 */
public class BillingAmount {
    private final int value;

    public BillingAmount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "円";
    }
}
