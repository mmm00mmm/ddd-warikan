package domain.model.amount;

/**
 * 一人当たりの比率
 */
public class PercentageOfPerMember {
    private final int value;

    public PercentageOfPerMember(int value) {
        this.value = value;
    }

    public PercentageOfPerMember calculate(
            PercentageByPaymentType percentageByPaymentType,
            NumberOfPeopleByPaymentType numberOfPeopleByPaymentType) {
        return null;
    }
}
