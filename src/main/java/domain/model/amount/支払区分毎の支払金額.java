package domain.model.amount;

import domain.model.member.PaymentType;

public class 支払区分毎の支払金額 {
    private final int value;

    public 支払区分毎の支払金額(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //TODO:ここおかしい
    public static 支払区分毎の支払金額 算出する(均一の支払金額 _均一の支払金額, PaymentType paymentType) {
        return new 支払区分毎の支払金額(
                _均一の支払金額.getValue() * paymentType.getValue()
        );
    }
}
