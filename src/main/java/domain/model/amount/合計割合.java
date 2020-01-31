package domain.model.amount;

import domain.model.member.Member;
import domain.model.member.MemberList;
import domain.model.member.PaymentType;

public class 合計割合 {
    private final Integer value;

    public 合計割合(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public Integer getValue() {
        return value;
    }

    public static 合計割合 算出する(MemberList memberList) {
        return new 合計割合(
                memberList.stream()
                        .map(Member::getPaymentType)
                        .mapToInt(PaymentType::getValue)
                        .sum()
        );
    }
}
