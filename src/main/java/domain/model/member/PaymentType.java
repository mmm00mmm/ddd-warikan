package domain.model.member;

public enum PaymentType {
    多め(PaymentRate.多め),
    普通(PaymentRate.普通),
    少なめ(PaymentRate.少なめ);

    private final PaymentRate paymentRate;

    PaymentType(PaymentRate paymentRate) {
        this.paymentRate = paymentRate;
    }

    public PaymentRate getPaymentRate() {
        return paymentRate;
    }
}
