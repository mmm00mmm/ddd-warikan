package amount;

import member.PaymentType;

/**
 * 支払区分ごとの比重
 */
public class SpecificWeightByPaymentType {
    private final int value;

    public SpecificWeightByPaymentType(int value) {
        this.value = value;
    }

    public SpecificWeightByPaymentType calculate(
            PaymentType paymentType,
            NumberOfPeopleByPaymentType numberOfPeopleByPaymentType) {
        return null;
    }
}
