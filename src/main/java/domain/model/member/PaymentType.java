package domain.model.member;

public enum PaymentType {
    HIGH(3),
    NORMAL(2),
    LOW(1);

    private final int value;

    PaymentType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
