package domain.model.amount;

import domain.model.member.PaymentType;

public class 一人当たりの支払金額B {
    private final int value;

    public 一人当たりの支払金額B(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static 一人当たりの支払金額B 算出(一つ分の支払金額 onePayment, PaymentType paymentType) {
        return new 一人当たりの支払金額B(
                onePayment.getValue() * paymentType.getValue().getValue()
        );
    }
}
