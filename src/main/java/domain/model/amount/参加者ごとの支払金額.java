package domain.model.amount;

import domain.model.member.Member;

public class 参加者ごとの支払金額 {
    private final Member member;
    private final 支払区分毎の支払金額 _支払区分毎の支払金額;

    public 参加者ごとの支払金額(Member member, 支払区分毎の支払金額 _支払区分毎の支払金額) {
        this.member = member;
        this._支払区分毎の支払金額 = _支払区分毎の支払金額;
    }

    public 支払区分毎の支払金額 get_支払区分毎の支払金額() {
        return this._支払区分毎の支払金額;
    }

    @Override
    public String toString() {
        return "参加者名:"
                + member.toString() + "\n"
                + "支払金額:"
                + _支払区分毎の支払金額.getValue() + "\n\n";
    }

    //TODO:ここおかしい
    public static 参加者ごとの支払金額 create(Member member, 均一の支払金額 onePayment) {
        支払区分毎の支払金額 _支払区分毎の支払金額 = 支払区分毎の支払金額.算出する(onePayment, member.getPaymentType());
        return new 参加者ごとの支払金額(member, _支払区分毎の支払金額);
    }
}
