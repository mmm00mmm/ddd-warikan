package domain.model.amount;

/**
 * 支払区分ごとの比率
 */
public class PercentageByPaymentType {
    private final int value;

    public PercentageByPaymentType(int value) {
        this.value = value;
    }

    public PercentageByPaymentType calculate(SpecificWeightByPaymentType specificWeightByPaymentType) {
        return null;
    }
}
