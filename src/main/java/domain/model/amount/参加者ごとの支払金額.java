package domain.model.amount;

import domain.model.member.Member;

public class 参加者ごとの支払金額 {
    private final Member member;
    private final 一人当たりの支払金額B _一人当たりの支払金額B;

    public 参加者ごとの支払金額(Member member, 一人当たりの支払金額B _一人当たりの支払金額B) {
        this.member = member;
        this._一人当たりの支払金額B = _一人当たりの支払金額B;
    }

    public 一人当たりの支払金額B get_一人当たりの支払金額B() {
        return this._一人当たりの支払金額B;
    }

    @Override
    public String toString() {
        return "参加者名:"
                + member.toString() + "\n"
                + "支払金額:"
                + _一人当たりの支払金額B.getValue() + "\n\n";
    }

    public static 参加者ごとの支払金額 create(Member member, 一つ分の支払金額 onePayment) {
        return new 参加者ごとの支払金額(
                member,
                new 一人当たりの支払金額B(onePayment.getValue() * member.getPaymentType().getValue().getValue())
        );
    }
}
