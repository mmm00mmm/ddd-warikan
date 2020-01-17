package domain.model.member;

public enum PaymentType {
    NORMAL(2);

    private final int value;

    PaymentType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
