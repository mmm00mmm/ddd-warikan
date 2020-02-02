package domain.model.amount;

/**
 * 請求金額
 */
public class BillingAmount {
    private final Integer value; //TODO:intでいいのかな

    //TODO:intでいいのかな
    public BillingAmount(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "円";
    }
}
