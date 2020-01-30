package domain.model.amount;

public class 一つ分の支払金額 {
    private final Integer value;

    public 一つ分の支払金額(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static 一つ分の支払金額 算出する(BillingAmount billingAmount, 合計割合 goukeiWariai) {
        return new 一つ分の支払金額(billingAmount.getValue() / goukeiWariai.getValue());
    }
}
