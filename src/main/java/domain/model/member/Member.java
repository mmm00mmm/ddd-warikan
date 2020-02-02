package domain.model.member;

public class Member {
    private final MemberName memberName;
    private final SecretaryType secretaryType;
    private final PaymentType paymentType;

    public Member(MemberName memberName, SecretaryType secretaryType, PaymentType paymentType) {
        this.memberName = memberName;
        this.secretaryType = secretaryType;
        this.paymentType = paymentType;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    @Override
    public String toString() {
        return memberName.toString();
    }
}
