package domain.model.member;

public enum PaymentRate {
    多め(3),
    普通(2),
    少なめ(1);

    private final int value;

    PaymentRate(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
