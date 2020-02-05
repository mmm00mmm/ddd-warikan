package domain.model.member;

public enum PaymentType {
    多め(3),
    普通(2),
    少なめ(1);

    private final int value;

    PaymentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
