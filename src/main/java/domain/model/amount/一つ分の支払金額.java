package domain.model.amount;

import domain.model.rate.合計割合;

public class 一つ分の支払金額 {
    private final int value;

    public 一つ分の支払金額(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static 一つ分の支払金額 算出する(BillingAmount billingAmount, 合計割合 goukeiWariai) {
        return new 一つ分の支払金額(billingAmount.getValue() / goukeiWariai.getValue());
    }
}
