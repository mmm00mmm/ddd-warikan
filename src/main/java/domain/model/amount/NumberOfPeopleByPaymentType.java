package domain.model.amount;

import domain.model.member.MemberList;
import domain.model.member.PaymentType;

/**
 * 支払区分ごとの人数
 */
public class NumberOfPeopleByPaymentType {
    private final int value;

    public NumberOfPeopleByPaymentType(int value) {
        this.value = value;
    }

    public NumberOfPeopleByPaymentType calculate(MemberList memberList, PaymentType paymentType) {
        return null;
    }
}
